package tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.dao.CandidateDaoImpl;
import com.sunbeam.entity.candidate;

public class tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (CandidateDaoImpl candidateDaoImpl = new CandidateDaoImpl()) {
			List<candidate> candidateList = candidateDaoImpl.findAll();
			// candidateList.forEach(s -> System.out.println(s));
			for (candidate can : candidateList) {
				System.out.println(can);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===================================================================");
		try (CandidateDaoImpl candidateDaoImpl = new CandidateDaoImpl()) {
			System.out.println("Eneter party name for serche");
			String party = sc.next();
			List<candidate> candidateList = candidateDaoImpl.findByParty(party);
			// candidateList.forEach(s -> System.out.println(s));
			for (candidate can : candidateList) {
				System.out.println(can);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("===================================================================");
		try (CandidateDaoImpl candidateDaoImpl = new CandidateDaoImpl()) {
			List<candidate> candidateList = candidateDaoImpl.findAllOrderByVotesDesc();
			for (candidate can : candidateList) {
				System.out.println(can);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

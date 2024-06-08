package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sunbeam.entity.candidate;
import com.sunbeam.utils.DbUtil;

public class CandidateDaoImpl implements AutoCloseable {
	private Connection connection;

	public CandidateDaoImpl() throws SQLException {
		connection = DbUtil.getConnection();
	}

	public List<candidate> findAll() throws Exception {
		String sql = "SELECT * FROM candidates";
		List<candidate> candidatesList = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			candidatesList = new ArrayList<candidate>();
			while (rs.next()) {
				candidate can = new candidate();
				can.setId(rs.getInt(1));
				can.setName(rs.getString(2));
				can.setParty(rs.getString(3));
				can.setVotes(rs.getInt(4));
				candidatesList.add(can);
			}
		}
		return candidatesList;
	}

	public List<candidate> findByParty(String party) throws SQLException {
		String sql = "SELECT * FROM candidates WHERE party = ?";

		List<candidate> candidatesList = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, party);
			ResultSet rs = stmt.executeQuery();
			candidatesList = new ArrayList<candidate>();
			while (rs.next()) {
				candidate can = new candidate();
				can.setId(rs.getInt(1));
				can.setName(rs.getString(2));
				can.setParty(rs.getString(3));
				can.setVotes(rs.getInt(4));
				candidatesList.add(can);
			}
		}
		return candidatesList;

	}
	public List<candidate> findAllOrderByVotesDesc() throws SQLException{
		String sql = "SELECT * FROM candidates order by votes desc";
		List<candidate> candidatesList = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			candidatesList = new ArrayList<candidate>();
			while (rs.next()) {
				candidate can = new candidate();
				can.setId(rs.getInt(1));
				can.setName(rs.getString(2));
				can.setParty(rs.getString(3));
				can.setVotes(rs.getInt(4));
				candidatesList.add(can);
			}
		}
		return candidatesList;
	}
//	public void deleteById(int id) throws SQLException{
//		String sql="delete from candidates where id = ?";
//	    try(PreparedStatement stmt=connection.prepareStatement(sql)){
//	    	stmt.setInt(1, id);
//	    	stmt.executeUpdate();
//	    }
//	}

	@Override
	public void close() throws Exception {
		if (connection != null)
			connection.close();
	}

}

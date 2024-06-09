package com.sunbeam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.pojos.Candidate;
@WebServlet("/editcand")
public class EditCandidateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idstr = req.getParameter("id");
		int id = Integer.parseInt(idstr);
		Candidate c = null;
		try (CandidateDao candDao = new CandidateDaoImpl()) {
			c = candDao.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Edit candidate</title>");
		out.println("<head/>");
		out.println("<body>");
		out.println("<h3>Online Voting</h3>");
		out.println("<form method='post' action='editcand'>");
		//out.printf("Id: <input type='text' name='id' value='%d' readonly/><br/></br>\n", c.getId());
		out.printf("<input type='hidden' name='id' value='%d'/>\n", c.getId());
		out.printf("Name: <input type='text' name='name' value='%s'/><br/><br/>\n", c.getName());
		out.printf("Name: <input type='text' name='party' value='%s'/><br/><br/>\n", c.getParty());
		out.printf("Name: <input type='text' name='votes' value='%s' readonly/><br/><br/>\n", c.getVotes());
		out.println("<input type ='submit' value='Update Candidate' />");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// get the candidate details (from req)
			String idStr1 = req.getParameter("id");
			int id1 = Integer.parseInt(idStr1); 
			String name = req.getParameter("name");
		String party = req.getParameter("party");
			String votesStr1 = req.getParameter("votes");
			int votes1 = Integer.parseInt(votesStr1);
			Candidate c = new Candidate(id1, name, party, votes1);
			try(CandidateDao candDao = new CandidateDaoImpl()) {
				int count = candDao.update(c);
			//resp.sendRedirect("result");
			String msg = "Candidates Edited: " + count;
						req.setAttribute("message", msg);
						//resp.sendRedirect("result");
						RequestDispatcher rd = req.getRequestDispatcher("result");
						rd.forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
		}
		}
}

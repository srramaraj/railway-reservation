package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<!-- DW6 -->\n");
      out.write("<head>\n");
      out.write("<!-- Copyright 2005 Macromedia, Inc. All rights reserved. -->\n");
      out.write("<title>Indian Railways</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"mm_restaurant1.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#0066cc\">\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("\t<tr bgcolor=\"#99ccff\">\n");
      out.write("\t<td width=\"134\" nowrap=\"nowrap\" bgcolor=\"#FFFFFF\" ><img src=\"Images/railways.jpg\" width=\"101\" height=\"80\" longdesc=\"/Images/railways.jpg\" /></td>\n");
      out.write("\t<td height=\"60\" colspan=\"3\" nowrap=\"nowrap\" bgcolor=\"#FFFFFF\" class=\"logo\"><p align=\"center\"><strong>INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY</strong></p>\n");
      out.write("\t<div align=\"center\"><span class=\"tagline\">| Government Of India |</span></td>\n");
      out.write("\t<td width=\"4\" bgcolor=\"#FFFFFF\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\" bgcolor=\"#FFFFFF\"><img src=\"Images/crisLogo[1].gif\" width=\"86\" height=\"64\" longdesc=\"/Images/crisLogo[1].gif\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#003399\">\n");
      out.write("\t<td width=\"134\" nowrap=\"nowrap\">&nbsp;</td>\n");
      out.write("\t<td height=\"36\" colspan=\"3\" id=\"navigation\" nowrap=\"nowrap\" class=\"navText\"><a href=\"index.jsp\">HOME</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      <a href=\"routefinder.jsp\">TRAIN SCHEDULE</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href=\"PNREnquiry.jsp\">PNR ENQUIRY</a>&nbsp;\n");
      out.write("      &nbsp;&nbsp;&nbsp; <a href=\"FareEnquiry.jsp\">FARES</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      <a href=\"Login.jsp\">RESERVATION</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"javascript:;\">INFORMATION</a>&nbsp;&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t  <td width=\"4\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"6\"><img src=\"mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"2\" valign=\"top\" bgcolor=\"#ffffcc\">\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"230\">\n");
      out.write("\t\t\n");
      out.write("\t</table>\t</td>\n");
      out.write("\t<td width=\"51\" valign=\"top\"><img src=\"/Images/mm_spacer.gif\" alt=\"\" width=\"50\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t<td width=\"454\" valign=\"top\"><br />\n");
      out.write("\t&nbsp;<br />\n");
      out.write("\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"440\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td class=\"pageHeader\">Registration Form :</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td class=\"bodyText\"><p>Please fill in the required details and click Submit\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("<table width=\"600px\" cellspacing=\"1\" cellpadding=\"0\" border=\"0\" bordercolor=\"#000\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldThirteen\" align=\"center\" colspan=\"4\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <!-- //Renu Check USER AVAILABILITY//STARTS -->\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"4\" align=\"left\" class=\"redcol\"><div id=\"result\"> &nbsp; </div></td>\n");
      out.write("  </tr>\n");
      out.write("  <!-- //Renu Check USER AVAILABILITY//ends -->\n");
      out.write("  <tr>\n");
      out.write("      <form action=\"RegHandler.jsp\" method=\"get\">\n");
      out.write("    <td class=\"boldEleven\" width=\"32%\"> Username <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" class=\"redcol\"><input type=\"text\" name=\"username\" maxlength=\"10\" size=\"13\" value=\"\"/>\n");
      out.write("      &nbsp; <b>(Max 10 Chars)</b>\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" width=\"32%\"> Password <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><input type=\"password\" name=\"password\" maxlength=\"10\" size=\"13\" value=\"\" class=\"formText135\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" width=\"32%\"> Confirm Password <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><input type=\"password\" name=\"confirmpassword\" maxlength=\"10\" size=\"13\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" class=\"boldEleven\" >&nbsp;</td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" > First name <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" ><input type=\"text\" name=\"firstname\" maxlength=\"30\" size=\"30\" value=\"\" class=\"formText135\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" > Last name <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><input type=\"text\" name=\"lastname\" maxlength=\"30\" size=\"30\" value=\"\" class=\"formText135\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" > Email ID <font class=\"redcol\" align=\"absmiddle\">*</font> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><input type=\"text\" name=\"email\" maxlength=\"45\" size=\"30\" value=\"\" class=\"formText135\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td valign=\"top\" class=\"boldEleven\" > Address <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><input type=\"text\" name=\"resAddress1\" maxlength=\"30\" size=\"35\" value=\"\" onchange=\"return copyrestooff()\" class=\"formText135\" />\n");
      out.write("        <br />\n");
      out.write("        <input type=\"text\" name=\"resAddress2\" maxlength=\"30\" size=\"35\" value=\"\" onchange=\"return copyrestooff()\" class=\"formText135\" />\n");
      out.write("        <span class=\"Redcol\"><font color=\"red\">(optional)</font></span> <br />\n");
      out.write("        <input type=\"text\" name=\"resAddress3\" maxlength=\"30\" size=\"35\" value=\"\" onchange=\"return copyrestooff()\" class=\"formText135\" />\n");
      out.write("        <span class=\"Redcol\"><font color=\"red\">(optional)</font></span> </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" > City <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><select name=\"rescity\" onchange=\"return copyrestooff()\" class=\"formText0\">\n");
      out.write("      <option value=\"\" selected=\"selected\">-- Select One --</option>\n");
      out.write("      <option value=\"Abohar\">Abohar</option>\n");
      out.write("      <option value=\"Abu Road\">Abu Road</option>\n");
      out.write("      <option value=\"Anantnag\">Anantnag</option>\n");
      out.write("      <option value=\"Agartala\">Agartala</option>\n");
      out.write("      <option value=\"Agra\">Agra</option>\n");
      out.write("      <option value=\"Aizawl\">Aizawl</option>\n");
      out.write("      <option value=\"Ajmer\">Ajmer</option>\n");
      out.write("      <option value=\"Akola\">Akola</option>\n");
      out.write("      <option value=\"Allahabad\">Allahabad</option>\n");
      out.write("      <option value=\"Aligarh\">Aligarh</option>\n");
      out.write("      <option value=\"Almora\">Almora</option>\n");
      out.write("      <option value=\"Aluva\">Aluva</option>\n");
      out.write("      <option value=\"Alapuzha\">Alapuzha</option>\n");
      out.write("      <option value=\"Ahmedabad\">Ahmedabad</option>\n");
      out.write("      <option value=\"Amritsar\">Amritsar</option>\n");
      out.write("      <option value=\"Ambala\">Ambala</option>\n");
      out.write("      <option value=\"Anand\">Anand</option>\n");
      out.write("      <option value=\"Asansol\">Asansol</option>\n");
      out.write("      <option value=\"Aurangabad\">Aurangabad</option>\n");
      out.write("      <option value=\"Baddi\">Baddi</option>\n");
      out.write("      <option value=\"Bahadurgarh\">Bahadurgarh</option>\n");
      out.write("      <option value=\"Ballabgarh\">Ballabgarh</option>\n");
      out.write("      <option value=\"Bangalore\">Bangalore</option>\n");
      out.write("      <option value=\"Bareilly\">Bareilly</option>\n");
      out.write("      <option value=\"Belgaum\">Belgaum</option>\n");
      out.write("      <option value=\"Bhagalpur\">Bhagalpur</option>\n");
      out.write("      <option value=\"Bharuch\">Bharuch</option>\n");
      out.write("      <option value=\"Bhatinda\">Bhatinda</option>\n");
      out.write("      <option value=\"Bhavnagar\">Bhavnagar</option>\n");
      out.write("      <option value=\"Bhilai\">Bhilai</option>\n");
      out.write("      <option value=\"Bhopal\">Bhopal</option>\n");
      out.write("      <option value=\"Bhubaneshwar\">Bhubaneshwar</option>\n");
      out.write("      <option value=\"Bhuj\">Bhuj</option>\n");
      out.write("      <option value=\"Bijbehara\">Bijbehara</option>\n");
      out.write("      <option value=\"Bijnore\">Bijnore</option>\n");
      out.write("      <option value=\"Bilaspur\">Bilaspur</option>\n");
      out.write("      <option value=\"Bikaner\">Bikaner</option>\n");
      out.write("      <option value=\"Bokaro\">Bokaro</option>\n");
      out.write("      <option value=\"Budayun\">Budayun</option>\n");
      out.write("      <option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("      <option value=\"Chandausi\">Chandausi</option>\n");
      out.write("      <option value=\"Chengannur\">Chengannur</option>\n");
      out.write("      <option value=\"Chennai\">Chennai</option>\n");
      out.write("      <option value=\"Coimbatore\">Coimbatore</option>\n");
      out.write("      <option value=\"Cuddapah\">Cuddapah</option>\n");
      out.write("      <option value=\"Cuttack\">Cuttack</option>\n");
      out.write("      <option value=\"Dadri\">Dadri</option>\n");
      out.write("      <option value=\"Daman and Diu\">Daman and Diu</option>\n");
      out.write("      <option value=\"Darjeeling\">Darjeeling</option>\n");
      out.write("      <option value=\"Davangere\">Davangere</option>\n");
      out.write("      <option value=\"Dehradun\">Dehradun</option>\n");
      out.write("      <option value=\"Dhanbad\">Dhanbad</option>\n");
      out.write("      <option value=\"Dharwad\">Dharwad</option>\n");
      out.write("      <option value=\"Dibrugarh\">Dibrugarh</option>\n");
      out.write("      <option value=\"Dimapur\">Dimapur</option>\n");
      out.write("      <option value=\"Dindugal\">Dindugal</option>\n");
      out.write("      <option value=\"Durg\">Durg</option>\n");
      out.write("      <option value=\"Durgapur\">Durgapur</option>\n");
      out.write("      <option value=\"Erode\">Erode</option>\n");
      out.write("      <option value=\"Faridabad\">Faridabad</option>\n");
      out.write("      <option value=\"Ferozpur\">Ferozpur</option>\n");
      out.write("      <option value=\"Firozabad\">Firozabad</option>\n");
      out.write("      <option value=\"Gangtok\">Gangtok</option>\n");
      out.write("      <option value=\"Ghandinagar\">Ghandinagar</option>\n");
      out.write("      <option value=\"Ghaziabad\">Ghaziabad</option>\n");
      out.write("      <option value=\"Gwalior\">Gwalior</option>\n");
      out.write("      <option value=\"Gorakhpur\">Gorakhpur</option>\n");
      out.write("      <option value=\"Gulbarga\">Gulbarga</option>\n");
      out.write("      <option value=\"Guna\">Guna</option>\n");
      out.write("      <option value=\"Guntur\">Guntur</option>\n");
      out.write("      <option value=\"Gurgaon\">Gurgaon</option>\n");
      out.write("      <option value=\"Guwahati\">Guwahati</option>\n");
      out.write("      <option value=\"Haldwani\">Haldwani</option>\n");
      out.write("      <option value=\"Haldia\">Haldia</option>\n");
      out.write("      <option value=\"Hapur\">Hapur</option>\n");
      out.write("      <option value=\"Haridwar\">Haridwar</option>\n");
      out.write("      <option value=\"Hathras\">Hathras</option>\n");
      out.write("      <option value=\"Hazira\">Hazira</option>\n");
      out.write("      <option value=\"Hissar\">Hissar</option>\n");
      out.write("      <option value=\"Hooghly\">Hooghly</option>\n");
      out.write("      <option value=\"Hoshiarpur\">Hoshiarpur</option>\n");
      out.write("      <option value=\"Howrah\">Howrah</option>\n");
      out.write("      <option value=\"Hubli\">Hubli</option>\n");
      out.write("      <option value=\"Hyderabad\">Hyderabad</option>\n");
      out.write("      <option value=\"Imphal\">Imphal</option>\n");
      out.write("      <option value=\"Indore\">Indore</option>\n");
      out.write("      <option value=\"Jabalpur\">Jabalpur</option>\n");
      out.write("      <option value=\"Jaipur\">Jaipur</option>\n");
      out.write("      <option value=\"Jalandhar\">Jalandhar</option>\n");
      out.write("      <option value=\"Jalgaon\">Jalgaon</option>\n");
      out.write("      <option value=\"Jammu\">Jammu</option>\n");
      out.write("      <option value=\"Jamnagar\">Jamnagar</option>\n");
      out.write("      <option value=\"Jamshedpur\">Jamshedpur</option>\n");
      out.write("      <option value=\"Jhansi\">Jhansi</option>\n");
      out.write("      <option value=\"Jodhpur\">Jodhpur</option>\n");
      out.write("      <option value=\"Jorhat\">Jorhat</option>\n");
      out.write("      <option value=\"Kakinada\">Kakinada</option>\n");
      out.write("      <option value=\"Kandla\">Kandla</option>\n");
      out.write("      <option value=\"Kannur\">Kannur</option>\n");
      out.write("      <option value=\"Kanpur\">Kanpur</option>\n");
      out.write("      <option value=\"Karnal\">Karnal</option>\n");
      out.write("      <option value=\"Katni\">Katni</option>\n");
      out.write("      <option value=\"Kharagpur\">Kharagpur</option>\n");
      out.write("      <option value=\"Kohima\">Kohima</option>\n");
      out.write("      <option value=\"Kolhapur\">Kolhapur</option>\n");
      out.write("      <option value=\"Kolkata\">Kolkata</option>\n");
      out.write("      <option value=\"Kollam\">Kollam</option>\n");
      out.write("      <option value=\"Kochi\">Kochi</option>\n");
      out.write("      <option value=\"Kottayam\">Kottayam</option>\n");
      out.write("      <option value=\"Kozhikode\">Kozhikode</option>\n");
      out.write("      <option value=\"Kota\">Kota</option>\n");
      out.write("      <option value=\"Kodaikanal\">Kodaikanal</option>\n");
      out.write("      <option value=\"Kovilpatti\">Kovilpatti</option>\n");
      out.write("      <option value=\"Kurnool\">Kurnool</option>\n");
      out.write("      <option value=\"Lucknow\">Lucknow</option>\n");
      out.write("      <option value=\"Ludhiana\">Ludhiana</option>\n");
      out.write("      <option value=\"Madurai\">Madurai</option>\n");
      out.write("      <option value=\"Mangalore\">Mangalore</option>\n");
      out.write("      <option value=\"Manipal\">Manipal</option>\n");
      out.write("      <option value=\"Mapusa\">Mapusa</option>\n");
      out.write("      <option value=\"Margao\">Margao</option>\n");
      out.write("      <option value=\"Mathura\">Mathura</option>\n");
      out.write("      <option value=\"Meerut\">Meerut</option>\n");
      out.write("      <option value=\"Mehsana\">Mehsana</option>\n");
      out.write("      <option value=\"Mettupalyam\">Mettupalyam</option>\n");
      out.write("      <option value=\"Mirzapur\">Mirzapur</option>\n");
      out.write("      <option value=\"Moradabad\">Moradabad</option>\n");
      out.write("      <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("      <option value=\"Muzaffarnagar\">Muzaffarnagar</option>\n");
      out.write("      <option value=\"Muzaffarpur\">Muzaffarpur</option>\n");
      out.write("      <option value=\"Mysore\">Mysore</option>\n");
      out.write("      <option value=\"Nadiad\">Nadiad</option>\n");
      out.write("      <option value=\"Nagercoil\">Nagercoil</option>\n");
      out.write("      <option value=\"Nagpur\">Nagpur</option>\n");
      out.write("      <option value=\"Nainital\">Nainital</option>\n");
      out.write("      <option value=\"Nashik\">Nashik</option>\n");
      out.write("      <option value=\"Navsari\">Navsari</option>\n");
      out.write("      <option value=\"Nazira\">Nazira</option>\n");
      out.write("      <option value=\"Nellore\">Nellore</option>\n");
      out.write("      <option value=\"Noida\">Noida</option>\n");
      out.write("      <option value=\"New Delhi\">New Delhi</option>\n");
      out.write("      <option value=\"Nizamabad\">Nizamabad</option>\n");
      out.write("      <option value=\"Ooty\">Ooty</option>\n");
      out.write("      <option value=\"Patiala\">Patiala</option>\n");
      out.write("      <option value=\"Palakkad\">Palakkad</option>\n");
      out.write("      <option value=\"Panchkula\">Panchkula</option>\n");
      out.write("      <option value=\"Panipat\">Panipat</option>\n");
      out.write("      <option value=\"Panjim\">Panjim</option>\n");
      out.write("      <option value=\"Pathankot\">Pathankot</option>\n");
      out.write("      <option value=\"Patiala\">Patiala</option>\n");
      out.write("      <option value=\"Patna\">Patna</option>\n");
      out.write("      <option value=\"Ponda\">Ponda</option>\n");
      out.write("      <option value=\"Pondicherry\">Pondicherry</option>\n");
      out.write("      <option value=\"Port Blair\">Port Blair</option>\n");
      out.write("      <option value=\"Pune\">Pune</option>\n");
      out.write("      <option value=\"Puri\">Puri</option>\n");
      out.write("      <option value=\"Raigarh\">Raigarh</option>\n");
      out.write("      <option value=\"Raipur\">Raipur</option>\n");
      out.write("      <option value=\"Rajkot\">Rajkot</option>\n");
      out.write("      <option value=\"Rajamundry\">Rajamundry</option>\n");
      out.write("      <option value=\"Rajapalayam\">Rajapalayam</option>\n");
      out.write("      <option value=\"Ranchi\">Ranchi</option>\n");
      out.write("      <option value=\"Raniganj\">Raniganj</option>\n");
      out.write("      <option value=\"Ranipet\">Ranipet</option>\n");
      out.write("      <option value=\"Ratlam\">Ratlam</option>\n");
      out.write("      <option value=\"Rewa\">Rewa</option>\n");
      out.write("      <option value=\"Rishikesh\">Rishikesh</option>\n");
      out.write("      <option value=\"Roorkee\">Roorkee</option>\n");
      out.write("      <option value=\"Rourkela\">Rourkela</option>\n");
      out.write("      <option value=\"Salem\">Salem</option>\n");
      out.write("      <option value=\"Sangor\">Sangor</option>\n");
      out.write("      <option value=\"Saranpur\">Saranpur</option>\n");
      out.write("      <option value=\"Satna\">Satna</option>\n");
      out.write("      <option value=\"Secunderabad\">Secunderabad</option>\n");
      out.write("      <option value=\"Shahjahanpur\">Shahjahanpur</option>\n");
      out.write("      <option value=\"Shillong\">Shillong</option>\n");
      out.write("      <option value=\"Shimla\">Shimla</option>\n");
      out.write("      <option value=\"Shimoga\">Shimoga</option>\n");
      out.write("      <option value=\"Sibsagar\">Sibsagar</option>\n");
      out.write("      <option value=\"Silchar\">Silchar</option>\n");
      out.write("      <option value=\"Siliguri\">Siliguri</option>\n");
      out.write("      <option value=\"Silvasa\">Silvasa</option>\n");
      out.write("      <option value=\"Sivakasi\">Sivakasi</option>\n");
      out.write("      <option value=\"Srinagar\">Srinagar</option>\n");
      out.write("      <option value=\"Surat\">Surat</option>\n");
      out.write("      <option value=\"Thane\">Thane</option>\n");
      out.write("      <option value=\"Thanjavur\">Thanjavur</option>\n");
      out.write("      <option value=\"Thiruvananthapuram\">Thiruvananthapuram</option>\n");
      out.write("      <option value=\"Trissur\">Trissur</option>\n");
      out.write("      <option value=\"Tiruchchirapalli\">Tiruchchirapalli</option>\n");
      out.write("      <option value=\"Tirunelveli\">Tirunelveli</option>\n");
      out.write("      <option value=\"Tirupati\">Tirupati</option>\n");
      out.write("      <option value=\"Tiruppur\">Tiruppur</option>\n");
      out.write("      <option value=\"Tiruvalla\">Tiruvalla</option>\n");
      out.write("      <option value=\"Tumkur\">Tumkur</option>\n");
      out.write("      <option value=\"Tuticorin\">Tuticorin</option>\n");
      out.write("      <option value=\"Udaipur\">Udaipur</option>\n");
      out.write("      <option value=\"Udupi\">Udupi</option>\n");
      out.write("      <option value=\"Ujjain\">Ujjain</option>\n");
      out.write("      <option value=\"Vijayawada\">Vijayawada</option>\n");
      out.write("      <option value=\"Vishakapatnam\">Vishakapatnam</option>\n");
      out.write("      <option value=\"Vapi\">Vapi</option>\n");
      out.write("      <option value=\"Vasco\">Vasco</option>\n");
      out.write("      <option value=\"Vadodara\">Vadodara</option>\n");
      out.write("      <option value=\"Varanasi\">Varanasi</option>\n");
      out.write("      <option value=\"Virudhunagar\">Virudhunagar</option>\n");
      out.write("      <option value=\"Vrindavan\">Vrindavan</option>\n");
      out.write("      <option value=\"Warangal\">Warangal</option>\n");
      out.write("      <option value=\"Yamunanagar\">Yamunanagar</option>\n");
      out.write("    </select>\n");
      out.write("        <br />\n");
      out.write("      <font class=\"boldEleven\" >If not in the list, Please specify(in others)</font></br>    </td>\n");
      out.write("    <td align=\"left\" width=\"17%\" class=\"boldEleven\"><span class=\"name\">(other)</span>\n");
      out.write("        <input type=\"text\" name=\"resOtherCity\" maxlength=\"18\" size=\"16\" value=\"\" onchange=\"return copyrestooff()\" class=\"formText135\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" > State <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><select name=\"resstate\" onchange=\"return copyrestooff()\" class=\"formText0\">\n");
      out.write("      <option value=\"\" selected=\"selected\">-- Select One --</option>\n");
      out.write("      <option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("      <option value=\"Assam\">Assam</option>\n");
      out.write("      <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("      <option value=\"Andaman &amp; Nicobar\">Andaman &amp; Nicobar</option>\n");
      out.write("      <option value=\"Bihar\">Bihar</option>\n");
      out.write("      <option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("      <option value=\"Chhatisgarh\">Chhatisgarh</option>\n");
      out.write("      <option value=\"Delhi\">Delhi</option>\n");
      out.write("      <option value=\"Daman &amp; Diu\">Daman &amp; Diu</option>\n");
      out.write("      <option value=\"Nagar Haveli\">Nagar Haveli</option>\n");
      out.write("      <option value=\"Gujarat\">Gujarat</option>\n");
      out.write("      <option value=\"Goa\">Goa</option>\n");
      out.write("      <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\n");
      out.write("      <option value=\"Haryana\">Haryana</option>\n");
      out.write("      <option value=\"Jammu &amp; Kashmir\">Jammu &amp; Kashmir</option>\n");
      out.write("      <option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("      <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("      <option value=\"Kerala\">Kerala</option>\n");
      out.write("      <option value=\"Lakshadweep\">Lakshadweep</option>\n");
      out.write("      <option value=\"Manipur\">Manipur</option>\n");
      out.write("      <option value=\"Mizoram\">Mizoram</option>\n");
      out.write("      <option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("      <option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("      <option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("      <option value=\"Nagaland\">Nagaland</option>\n");
      out.write("      <option value=\"Orissa\">Orissa</option>\n");
      out.write("      <option value=\"Punjab\">Punjab</option>\n");
      out.write("      <option value=\"Pondicherry\">Pondicherry</option>\n");
      out.write("      <option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("      <option value=\"Sikkim\">Sikkim</option>\n");
      out.write("      <option value=\"Tripura\">Tripura</option>\n");
      out.write("      <option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("      <option value=\"Uttaranchal\">Uttaranchal</option>\n");
      out.write("      <option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("      <option value=\"West Bengal\">West Bengal</option>\n");
      out.write("    </select>\n");
      out.write("        <br />\n");
      out.write("      <font class=\"boldEleven\" >If not in the list, Please specify(in others) </font></br>    </td>\n");
      out.write("    <td align=\"left\" width=\"17%\" class=\"boldEleven\"><span class=\"name\">(other)</span>\n");
      out.write("        <input type=\"text\" name=\"resOtherState\" maxlength=\"17\" size=\"16\" value=\"\" onchange=\"return copyrestooff()\" class=\"formText135\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" > Pin/Zip <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <td align=\"left\" width=\"51%\"><input type=\"text\" name=\"pincode\" maxlength=\"6\" size=\"7\" value=\"\" onchange=\"return copyrestooff()\" class=\"formText135\" />    </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td class=\"boldEleven\" > Phone / Mobile <font class=\"redcol\" align=\"absmiddle\">*</font> </td>\n");
      out.write("    <!--StrutsTic4_ban/10-mar/2004/Sharath/Mod Begins\t-->\n");
      out.write("    <td align=\"left\" width=\"51%\"><input type=\"text\" name=\"phone\" maxlength=\"12\" size=\"12\" value=\"\" onchange=\"return copyrestooff()\" class=\"formText135\" />    </td>\n");
      out.write("    <!--StrutsTic4_ban/10-mar/2004/Sharath/Mod Ends\t-->\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td colspan=\"2\" class=\"boldEleven\" ><table cellspacing=\"0\" cellpadding=\"0\" id=\"rt4\" align=\"left\" border=\"0\">\n");
      out.write("      <tbody>\n");
      out.write("        <tr>\n");
      out.write("          <td align=\"left\" class=\"boldEleven\" >&nbsp;</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <td class=\"boldEleven\" align=\"left\"> *<b>Issue of SBI Railway Credit Card depends upon the approval of your application by SBI Cards &amp; Payment Services Pvt Ltd. If you do apply for the SBI Railway Credit Card &amp; your application is approved, you will be charged a additional nominal fee over &amp; above the existing Shubh Yatra Membership Fees (Rs 500, exclusive of applicable taxes).</b>&nbsp;&nbsp; </td>\n");
      out.write("        </tr>\n");
      out.write("      </tbody>\n");
      out.write("    </table></td>\n");
      out.write("  </tr>\n");
      out.write("  <input type=\"hidden\" name=\"mobileBookingOption\" value=\"\" />\n");
      out.write("  <!-- logic by biswadip  -->\n");
      out.write("  <!-- logic end by biswadip -->\n");
      out.write("  <!-- //CR098/SUNIL/01-MAR-2004/MOD ENDS -->\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"40\" colspan=\"4\" align=\"right\"><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"right\">\n");
      out.write("      <tr>\n");
      out.write("        <td><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" \t\t\t\t\t\t\t\t\talign=\"center\">\n");
      out.write("          <tr>\n");
      out.write("            <td valign=\"top\">&nbsp;</td>\n");
      out.write("            <td>&nbsp;</td>\n");
      out.write("            <td><input type=\"submit\" name=\"Submit\" value=\"Submit\"/></td>\n");
      out.write("            <td valign=\"top\">&nbsp;</td>\n");
      out.write("          </tr>\n");
      out.write("        </table></td>\n");
      out.write("        <td>&nbsp;</td>\n");
      out.write("        <td align=\"left\"><table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" \t\t\t\t\t\t\t\t\t\talign=\"center\">\n");
      out.write("       </form>\n");
      out.write("        </table></td>\n");
      out.write("      </tr>\n");
      out.write("    </table></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\t\t <br />\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\t</td>\n");
      out.write("\t<td width=\"4\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#ffffff\">\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t<td colspan=\"6\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#003399\">\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"2\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\t<tr bgcolor=\"#003399\">\n");
      out.write("\t<td colspan=\"6\"><img src=\"Images/mm_spacer.gif\" alt=\"\" width=\"1\" height=\"1\" border=\"0\" /></td>\n");
      out.write("\t</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<tr>\n");
      out.write("\t<td width=\"134\">&nbsp;</td>\n");
      out.write("\t<td width=\"188\">&nbsp;</td>\n");
      out.write("\t<td width=\"51\">&nbsp;</td>\n");
      out.write("\t<td width=\"454\">&nbsp;</td>\n");
      out.write("\t<td width=\"4\">&nbsp;</td>\n");
      out.write("\t<td width=\"164\">&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

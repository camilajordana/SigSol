package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TESTE_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/teste.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">            \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    var toggleMenu = {\n");
      out.write("\tinit : function(sContainerClass, sHiddenClass) {\n");
      out.write("\t\tif (!document.getElementById || !document.createTextNode) {return;} // Check for DOM support\n");
      out.write("\t\tvar arrMenus = this.getElementsByClassName(document, 'ul', sContainerClass);\n");
      out.write("\t\tvar arrSubMenus, oSubMenu, oLink;\n");
      out.write("\t\tfor (var i = 0; i < arrMenus.length; i++) {\n");
      out.write("\t\t\tarrSubMenus = arrMenus[i].getElementsByTagName('ul');\n");
      out.write("\t\t\tfor (var j = 0; j < arrSubMenus.length; j++) {\n");
      out.write("\t\t\t\toSubMenu = arrSubMenus[j];\n");
      out.write("\t\t\t\toLink = oSubMenu.parentNode.getElementsByTagName('a')[0];\n");
      out.write("\t\t\t\toLink.onclick = function(){toggleMenu.toggle(this.parentNode.getElementsByTagName('ul')[0], sHiddenClass); return false;}\n");
      out.write("\t\t\t\tthis.toggle(oSubMenu, sHiddenClass);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t},\n");
      out.write("\ttoggle : function(el, sHiddenClass) {\n");
      out.write("\t\tvar oRegExp = new RegExp(\"(^|\\\\s)\" + sHiddenClass + \"(\\\\s|$)\");\n");
      out.write("\t\tel.className = (oRegExp.test(el.className)) ? el.className.replace(oRegExp, '') : el.className + ' ' + sHiddenClass; // Add or remove the class name that hides the element\n");
      out.write("\t},\n");
      out.write("/* addEvent function from http://www.quirksmode.org/blog/archives/2005/10/_and_the_winner_1.html */\n");
      out.write("\taddEvent : function(obj, type, fn) {\n");
      out.write("\t\tif (obj.addEventListener)\n");
      out.write("\t\t\tobj.addEventListener(type, fn, false);\n");
      out.write("\t\telse if (obj.attachEvent) {\n");
      out.write("\t\t\tobj[\"e\"+type+fn] = fn;\n");
      out.write("\t\t\tobj[type+fn] = function() {obj[\"e\"+type+fn](window.event);}\n");
      out.write("\t\t\tobj.attachEvent(\"on\"+type, obj[type+fn]);\n");
      out.write("\t\t}\n");
      out.write("\t},\n");
      out.write("/*\n");
      out.write("Written by Jonathan Snook, http://www.snook.ca/jonathan\n");
      out.write("Add-ons by Robert Nyman, http://www.robertnyman.com\n");
      out.write("*/\n");
      out.write("\tgetElementsByClassName : function(oElm, strTagName, strClassName){\n");
      out.write("\t    var arrElements = (strTagName == \"*\" && document.all)? document.all : oElm.getElementsByTagName(strTagName);\n");
      out.write("\t    var arrReturnElements = new Array();\n");
      out.write("\t    strClassName = strClassName.replace(/\\-/g, \"\\\\-\");\n");
      out.write("\t    var oRegExp = new RegExp(\"(^|\\\\s)\" + strClassName + \"(\\\\s|$)\");\n");
      out.write("\t    var oElement;\n");
      out.write("\t    for(var i=0; i<arrElements.length; i++){\n");
      out.write("\t        oElement = arrElements[i];      \n");
      out.write("\t        if(oRegExp.test(oElement.className)){\n");
      out.write("\t            arrReturnElements.push(oElement);\n");
      out.write("\t        }   \n");
      out.write("\t    }\n");
      out.write("\t    return (arrReturnElements)\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("toggleMenu.addEvent(window, 'load', function(){toggleMenu.init('menu','hidden');});\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("    <ul class=\"menu\">\n");
      out.write("    <li><a href=\"#\">Category 1</a>\n");
      out.write("    <ul>\n");
      out.write("    <li><a href=\"#\">Submenu 1a</a></li>\n");
      out.write("    <li><a href=\"#\">Submenu 1b</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"#\">Category 2</a>\n");
      out.write("    <ul>\n");
      out.write("    <li><a href=\"#\">Submenu 2a</a></li>\n");
      out.write("    <li><a href=\"#\">Submenu 2b</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"#\">Category 3</a>\n");
      out.write("    <ul>\n");
      out.write("    <li><a href=\"#\">Submenu 3a</a></li>\n");
      out.write("    <li><a href=\"#\">Submenu 3b</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

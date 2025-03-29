package com.itheima;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/response")
public class ResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 设置响应状态码
        //resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        //2. 设置响应头
        resp.setHeader("Content-Type", "text/html;charset=UTF-8");
        //3. 设置响应体 - 获取字符输出流
        resp.getWriter().write("<h1 >Hello HTTP ~</h1>  ");
    }

}
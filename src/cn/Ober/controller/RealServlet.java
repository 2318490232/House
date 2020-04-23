package cn.Ober.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.Ober.entity.RealEstate;
import cn.Ober.service.RealEstateService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebServlet("/Real")
public class RealServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
    private RealEstateService re=(RealEstateService) ctx.getBean("realEstateService");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        req.setCharacterEncoding("UTF-8");
        //接收页面数据
        String op=req.getParameter("op");
        if("show".equals(op)) {
            //展示全部数据
            showReal(req,resp);
        }
    }

    @SuppressWarnings({ "unchecked" })
    private void showReal(HttpServletRequest req, HttpServletResponse resp) {
        try {
           List<RealEstate> realEstates =  new ArrayList<RealEstate>();
            realEstates= re.queryAllByLimit(1,10);
            req.getSession().setAttribute("realEstates", realEstates);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by likun on 2018/2/23 0023.
 */
public class FilterFirst implements Filter {
    FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        config=filterConfig;
        System.out.println("-----------filterFirst  init-------------");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-----------filterFirst  doFilter start-------------");
        filterChain.doFilter(req,resp);
        System.out.println("test------"+config.getInitParameter("test"));
        System.out.println("test1-----"+config.getInitParameter("test1"));
        System.out.println("-----------filterFirst  doFilter end-------------");
    }

    @Override
    public void destroy() {
        System.out.println("-----------filterFirst  destroy-------------");
    }
}

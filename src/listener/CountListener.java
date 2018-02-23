package listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by likun on 2018/2/23 0023.
 */
public class CountListener implements HttpSessionListener {
    private int count = 0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("-----------CountListener  sessionCreated-------------");
        count++;
        handleSession(httpSessionEvent);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("-----------CountListener  sessionDestroyed-------------");

        count--;
        handleSession(httpSessionEvent);
    }

    private void handleSession(HttpSessionEvent httpSessionEvent){
        HttpSession session = httpSessionEvent.getSession();
        ServletContext ctx = session.getServletContext();
        ctx.setAttribute("count",count);
    }
}

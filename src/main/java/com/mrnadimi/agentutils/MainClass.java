package com.mrnadimi.agentutils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.saghe.org
 * Developer website: https://www.mrnadimi.com
 * Created on 19 Oct, 2020
 * <p>
 * Description: This project copied from 'https://github.com/HaraldWalker/user-agent-utils'
 * I just updated some agents like 'Android9' and etc ...
 */
public class MainClass {

    private static final Log LOG = LogFactory.getLog(MainClass.class);

    public static void main(String[] args){
        UserAgent userAgent = UserAgent.parseUserAgentString("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.75 Safari/537.36");
        System.out.println(userAgent.getBrowser().name());
        System.out.println(userAgent.getBrowser().getId());
        System.out.println(userAgent.getOperatingSystem().name());
        System.out.println(userAgent.getBrowserVersion());
    }

}

package com.example.cloud.service.config.guanji;
import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Run
{
    private static Runtime runtime=Runtime.getRuntime();
    private static long beginTime;
    private static Robot robot;
    private static Scanner scanner=new Scanner(System.in);
    public static void welcome() throws IOException, ParseException
    {
        while(true)
        {
            System.out.println("#################################");
            System.out.println("#########要你命3000v0.1##########");
            System.out.println("##########1.延时关机#############");
            System.out.println("##########2.定时关机#############");
            System.out.println("##########3.距离关机的时间#######");
            System.out.println("##########4.停止关机#############");
            System.out.println("##########5.打开记事本###########");
            System.out.println("##########6.打开计算器###########");
            System.out.println("##########7.打开画图工具#########");
            System.out.println("##########8.重启#################");
            System.out.println("##########9.一键休眠#############");
            System.out.println("##########10.退出系统############");
            menu();
        }
    }
    public static void lockscreen()
    {
        try
        {
            //robot=new Robot();
            //robot.keyPress(KeyEvent.VK_WINDOWS);
            //robot.keyPress(KeyEvent.VK_L);
            runtime.exec("%windir%\\System32\\rundll32.exe user32.dll,LockWorkStation ");
        }

        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }


    //功能菜单
    public static void menu() throws IOException, ParseException
    {
        int choose=scanner.nextInt();
        switch(choose)
        {
            case 1:
                delayTimeShutdown();
                break;
            case 2:
                setTimeShutdown();
                break;
            case 3:
                calcShutdownTime();
                break;
            case 4:
                runtime.exec("shutdown -a");
                break;
            case 5:
                runtime.exec("notepad");
                break;
            case 6:
                runtime.exec("calc");
                break;
            case 7:
                runtime.exec("mspaint");
                break;
            case 8:
                runtime.exec("shutdown -r");
                break;
            case 9:
                runtime.exec("shutdown -h");
                break;
            case 10:
                System.exit(-1);
                break;
        }
    }
    //计算距离关机的时间
    public static void calcShutdownTime()
    {
        Date d=new Date();
        long nowTime=d.getTime();
        long shutdownTime=(beginTime-nowTime)/1000;
        if(shutdownTime<60)
        {
            System.out.println("距离关机还有"+shutdownTime+"秒");
        }
        else if(shutdownTime>60&&shutdownTime<3600)
        {
            System.out.println("距离关机还有"+shutdownTime/60+"分钟");
        }
        else if(shutdownTime>=60&&shutdownTime<=60*60*24)
        {
            System.out.println("距离关机还有"+shutdownTime/(60*60)+"小时");
        }
    }
    //延时关机
    public static void delayTimeShutdown()
    {
        System.out.println("请输入您要延时关机的时间：s表示秒 m表示分 h表示小时；示例：10s");
        String input=scanner.next();
        char c=input.charAt(input.length()-1);
        String result=input.substring(0,input.length()-1);
        //将字符串的数字准换成整数
        int iresult=Integer.parseInt(result);
        switch(c)
        {
            case 's':
                break;
            case 'm':
                iresult*=60;
                break;
            case 'h':
                iresult*=60*60;
                break;
        }
        Date d=new Date();
        long nowTime=d.getTime();
        beginTime=nowTime+(iresult*1000);
        shutdown(iresult);
    }


    private static void shutdown(int iresult)
    {
        try
        {
            runtime.exec("shutdown -s -t "+iresult);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //定时关机
    public static void setTimeShutdown() throws ParseException
    {
        System.out.println("请输入定时关机的时间；示例：2019-04-04-13:20:30");
        String input =scanner.next();
        Date systemDate=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        Date setDate=sdf.parse(input);
        if(setDate.after(systemDate))
        {
            long after=setDate.getTime();
            beginTime=after;
            long now=systemDate.getTime();
            after=(after-now)/1000;
            shutdown((int)after);
        }
        else
        {
            System.out.println("时间设置的不正确，不能设置之前的时间");
        }
    }
    public static void main(String[] args) throws IOException, ParseException
    {
        welcome();
    }



}

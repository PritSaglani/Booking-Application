import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class search {
    designs des = new designs();
    Scanner scan = new Scanner(System.in);
    FileInputStream fis;
    DataInputStream dis;
    booking bok = new booking();
    public void sopt() throws Exception
    {
        System.out.println("\n");
        int spt;
        while(true) 
        {
            des.equal();
            System.out.println("                                                              --SEARCH TICKET--");
            des.equal();
            System.out.println("                                            ╔════════════════╗                ╔════════════════╗");
            System.out.println("                                            ║     1.Bus      ║                ║    2.Train     ║");
            System.out.println("                                            ╚════════════════╝                ╚════════════════╝");
            System.out.println("                                            ╔════════════════╗                ╔════════════════╗");
            System.out.println("                                            ║    3.Flight    ║                ║     4.Exit     ║");
            System.out.println("                                            ╚════════════════╝                ╚════════════════╝");
            System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
            des.equal();
            System.out.print("          Select a option: ");
            if (scan.hasNextInt()) 
            {
                spt = scan.nextInt();
                break;
            } 
            else 
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch(spt)
        {
            case 0:
                bok.opt();
                break;
            case 1:
                sbus();
                break;
            case 2:
                strain();
                break;
            case 3:
                sflight();
                break;
            case 4:
                des.exit();
                break;
            default:
                System.out.println("                           YOU ENTERED A INVALID NO!!!");
                sopt();
                break;
        }
    }
    public void sbus() throws Exception
    {
        int burv;
        while(true)
        {
            des.equal();
            System.out.println("                                                              --SEARCH BUS TICKET--");
            des.equal();
            System.out.println("                            ╔════════════════╗               ╔════════════════╗              ╔════════════════╗");
            System.out.println("                            ║  1.Inter City  ║               ║  2.Inter State ║              ║     3.Exit     ║");
            System.out.println("                            ╚════════════════╝               ╚════════════════╝              ╚════════════════╝");
            System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
            des.equal();
            System.out.print("          Select a option: ");
            if(scan.hasNextInt())
            {
                burv = scan.nextInt();
                if(burv!=1 && burv!=2 && burv!=3)
                {
                    System.out.println("                           YOU SELECTED WRONG NUMBER");
                    sbus();
                }
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch (burv) 
        {
            case 0:
                bok.opt();
                break;
            case 1:
                sicity();
                break;
            case 2:
                sistate();
                break;
            case 3:
                des.exit();
                break;
            default:
                break;
        } 
    }
    public void sicity() throws Exception
    {
        boolean found = false;
        try
        {
            fis = new FileInputStream("data/busic.dat");
            dis = new DataInputStream(fis);
        }
        catch(Exception e)
        {
            System.out.println("\n                                                              NO TICKETS FOUND");
            bok.opt();  
        }
        des.equal();
        System.out.print("Enter ticket Id to search: ");
        int sid = scan.nextInt();
        try
        {
            while(true)
            {
                int vbid = dis.readInt();
                String vbname = dis.readUTF();
                int vpa = dis.readInt();
                String vbup = dis.readUTF();
                String vbud = dis.readUTF();
                String vbut = dis.readUTF();
                long vbm = dis.readLong();
                String vbe = dis.readUTF();
                int vba = dis.readInt();
                String vbbd = dis.readUTF();
                String vbbt = dis.readUTF();
                int vbf = dis.readInt();
                if(vbid==sid)
                {
                    System.out.println("\n");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("                                SMART BOOK");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket ID        :      "+vbid);
                    System.out.println("               Passenger name   :      "+vbname);
                    System.out.println("               Passengers       :      "+vpa);
                    System.out.println("               Pickup point     :      "+vbup);
                    System.out.println("               Drop point       :      "+vbud);
                    System.out.println("               Bus time         :      "+vbut);
                    System.out.println("               Mobile no        :      "+vbm);
                    System.out.println("               Email            :      "+vbe);
                    System.out.println("               Age              :      "+vba);
                    System.out.println("               Booking Date     :      "+vbbd);
                    System.out.println("               Booking Time     :      "+vbbt);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket fare      :      "+vbf);
                    int vtf = (vbf*vpa);
                    System.out.println("               Total fare       :      "+vtf);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    found = true;
                    bok.opt();
                    break;
                }
            }
        }
        catch(Exception e)
        {
            if(fis!=null)
            {
                fis.close();
            }
        }
        if(!found)
        {
            System.out.println("\n                                                         NO TICKETS FOUND ON THIS ID");
            bok.opt();
        }
    }
    public void sistate() throws Exception
    {
        boolean found = false;
        try
        {
            fis = new FileInputStream("data/busis.dat");
            dis = new DataInputStream(fis);
        }
        catch(Exception e)
        {
            System.out.println("\n                                                              NO TICKETS FOUND");
            bok.opt();  
        }
        des.equal();
        System.out.print("Enter ticket Id to search: ");
        int sid = scan.nextInt();
        try
        {
            while(true) 
            {
                int vbid = dis.readInt();
                String vbname = dis.readUTF();
                int vpa = dis.readInt();
                String vbup = dis.readUTF();
                String vbud = dis.readUTF();
                String vbut = dis.readUTF();
                long vbm = dis.readLong();
                String vbe = dis.readUTF();
                int vba = dis.readInt();
                String vbbd = dis.readUTF();
                String vbbt = dis.readUTF();
                int vbf = dis.readInt();
                if(vbid==sid)
                {
                    System.out.println("\n");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("                                SMART BOOK");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket ID        :      "+vbid);
                    System.out.println("               Passenger name   :      "+vbname);
                    System.out.println("               Passengers       :      "+vpa);
                    System.out.println("               Pickup point     :      "+vbup);
                    System.out.println("               Drop point       :      "+vbud);
                    System.out.println("               Bus time         :      "+vbut);
                    System.out.println("               Mobile no        :      "+vbm);
                    System.out.println("               Email            :      "+vbe);
                    System.out.println("               Age              :      "+vba);
                    System.out.println("               Booking Date     :      "+vbbd);
                    System.out.println("               Booking Time     :      "+vbbt);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket fare      :      "+vbf);
                    int vtf = (vbf*vpa);
                    System.out.println("               Total fare       :      "+vtf);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    found = true;
                    bok.opt();
                    break;
                }
            }
        }
        catch(Exception e)
        {
            if(fis!=null)
            {
                fis.close();
            }
        }
        if(!found)
        {
            System.out.println("\n                                                         NO TICKETS FOUND ON THIS ID");
            bok.opt();
        }
    }
    public void strain() throws Exception
    {
        boolean found = false;
        try
        {
            fis = new FileInputStream("data/train.dat");
            dis = new DataInputStream(fis);
        }
        catch(Exception e)
        {
            System.out.println("\n                                                              NO TICKETS FOUND");
            bok.opt();  
        }
        des.equal();
        System.out.print("Enter ticket Id to search: ");
        int sid = scan.nextInt();
        try
        {
            while(true)
            {
                int vbid = dis.readInt();
                String vbname = dis.readUTF();
                int vpa = dis.readInt();
                String vbup = dis.readUTF();
                String vbud = dis.readUTF();
                String vbut = dis.readUTF();
                long vbm = dis.readLong();
                long vad = dis.readLong();
                String vbe = dis.readUTF();
                int vba = dis.readInt();
                String vbbd = dis.readUTF();
                String vbbt = dis.readUTF();
                int vbf = dis.readInt();
                if(vbid==sid)
                {
                    System.out.println("\n");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("                                SMART BOOK");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket ID        :      "+vbid);
                    System.out.println("               Passenger name   :      "+vbname);
                    System.out.println("               Passengers       :      "+vpa);
                    System.out.println("               Pickup point     :      "+vbup);
                    System.out.println("               Drop point       :      "+vbud);
                    System.out.println("               Train time       :      "+vbut);
                    System.out.println("               Mobile no        :      "+vbm);
                    System.out.println("               Aadhar No        :      "+vad);
                    System.out.println("               Email            :      "+vbe);
                    System.out.println("               Age              :      "+vba);
                    System.out.println("               Booking Date     :      "+vbbd);
                    System.out.println("               Booking Time     :      "+vbbt);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket fare      :      "+vbf);
                    int vtf = (vbf*vpa);
                    System.out.println("               Total fare       :      "+vtf);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    found = true;
                    bok.opt();
                    break;
                }
            }
        }
        catch(Exception e)
        {
            if(fis!=null)
            {
                fis.close();
            }
        }
        if(!found)
        {
            System.out.println("\n                                                         NO TICKETS FOUND ON THIS ID");
            bok.opt();
        }
    }
    public void sflight() throws Exception
    {
        int fop;
        while(true)
        {
            System.out.println("\n");
            des.equal();
            System.out.println("                                                            -- VIEW FLIGHT TICKET--");
            des.equal();
            System.out.println("                            ╔════════════════╗               ╔═════════════════╗              ╔════════════════╗");
            System.out.println("                            ║   1.Domestic   ║               ║ 2.International ║              ║     3.Exit     ║");
            System.out.println("                            ╚════════════════╝               ╚═════════════════╝              ╚════════════════╝");
            System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
            des.equal();
            System.out.print("          Select a option: ");
            if(scan.hasNextInt())
            {
                fop = scan.nextInt();
                if(fop!=1 && fop!=2 && fop!=3)
                {
                    System.out.println("                           YOU SELECTED WRONG NUMBER");
                    sflight();
                }
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch(fop)
        {
            case 0:
                bok.opt();
                break;
            case 1:
                sdomes();
                break;
            case 2:
                sinter();
                break;
            case 3:
                bok.opt();
                break;
        }
    }
    public void sdomes() throws Exception
    {
        boolean found = false;
        try
        {
            fis = new FileInputStream("data/flightd.dat");
            dis = new DataInputStream(fis);
        }
        catch(Exception e)
        {
            System.out.println("\n                                                              NO TICKETS FOUND");
            bok.opt();  
        }
        des.equal();
        System.out.print("Enter ticket Id to search: ");
        int sid = scan.nextInt();
        try
        {
            while(true)
            {
                int vbid = dis.readInt();
                String vbname = dis.readUTF();
                int vpa = dis.readInt();
                String vbup = dis.readUTF();
                String vbud = dis.readUTF();
                String vbut = dis.readUTF();
                long vbm = dis.readLong();
                String vbe = dis.readUTF();
                int vba = dis.readInt();
                String vbbd = dis.readUTF();
                String vbbt = dis.readUTF();
                int vbf = dis.readInt();
                if(vbid==sid)
                {
                    System.out.println("\n");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("                                SMART BOOK");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket ID        :      "+vbid);
                    System.out.println("               Passenger name   :      "+vbname);
                    System.out.println("               Passengers       :      "+vpa);
                    System.out.println("               Pickup point     :      "+vbup);
                    System.out.println("               Drop point       :      "+vbud);
                    System.out.println("               Flight time      :      "+vbut);
                    System.out.println("               Mobile no        :      "+vbm);
                    System.out.println("               Email            :      "+vbe);
                    System.out.println("               Age              :      "+vba);
                    System.out.println("               Booking Date     :      "+vbbd);
                    System.out.println("               Booking Time     :      "+vbbt);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket fare      :      "+vbf);
                    int vtf = (vbf*vpa);
                    System.out.println("               Total fare       :      "+vtf);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    found = true;
                    bok.opt();
                    break;
                } 
            }
        }
        catch(Exception e)
        {
            if(fis!=null)
            {
                fis.close();
            }
        }
        if(!found)
        {
            System.out.println("\n                                                         NO TICKETS FOUND ON THIS ID");
            bok.opt();
        }
    }
    public void sinter() throws Exception
    {
        boolean found = false;
        try
        {
            fis = new FileInputStream("data/flighti.dat");
            dis = new DataInputStream(fis);
        }
        catch(Exception e)
        {
            System.out.println("\n                                                              NO TICKETS FOUND");
            bok.opt();  
        }
        des.equal();
        System.out.print("Enter ticket Id to search: ");
        int sid = scan.nextInt();
        try
        {
            while(true)
            {
                int vbid = dis.readInt();
                String vbname = dis.readUTF();
                int vpa = dis.readInt();
                String vbup = dis.readUTF();
                String vbud = dis.readUTF();
                String vbut = dis.readUTF();
                long vbm = dis.readLong();
                String vbe = dis.readUTF();
                int vba = dis.readInt();
                String nt = dis.readUTF();
                String pas = dis.readUTF();
                String vis = dis.readUTF();
                String vbbd = dis.readUTF();
                String vbbt = dis.readUTF();
                int vbf = dis.readInt();
                if(vbid==sid)
                {
                    System.out.println("\n");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("                                SMART BOOK");
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket ID        :      "+vbid);
                    System.out.println("               Passenger name   :      "+vbname);
                    System.out.println("               Passengers       :      "+vpa);
                    System.out.println("               Pickup point     :      "+vbup);
                    System.out.println("               Drop point       :      "+vbud);
                    System.out.println("               Flight time      :      "+vbut);
                    System.out.println("               Mobile no        :      "+vbm);
                    System.out.println("               Email            :      "+vbe);
                    System.out.println("               Age              :      "+vba);
                    System.out.println("               Nationality      :      "+nt);
                    System.out.println("               Passport No      :      "+pas);
                    System.out.println("               Visa No          :      "+vis);
                    System.out.println("               Booking Date     :      "+vbbd);
                    System.out.println("               Booking Time     :      "+vbbt);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    System.out.println("               Ticket fare      :      "+vbf);
                    int vtf = (vbf*vpa);
                    System.out.println("               Total fare       :      "+vtf);
                    System.out.println("           ═════════════════════════════════════════════════════");
                    found = true;
                    bok.opt();
                    break;
                } 
            }
        }
        catch(Exception e)
        {
            if(fis!=null)
            {
                fis.close();
            }
        }
        if(!found)
        {
            System.out.println("\n                                                         NO TICKETS FOUND ON THIS ID");
            bok.opt();
        }
    }
    public static void main(String[] args) {
        
    }
}
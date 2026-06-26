import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
public class view {
    designs des = new designs();
    Scanner scan = new Scanner(System.in);
    FileInputStream fis;
    DataInputStream dis;
    booking bok = new booking();
    public void vopt() throws Exception
    {
        System.out.println("\n");
        int vpt;
        while (true) 
        {
            des.equal();
            System.out.println("                                                              --VIEW TICKET--");
            des.equal();
            System.out.println("                            ╔════════════════╗               ╔════════════════╗              ╔════════════════╗");
            System.out.println("                            ║     1.Cab      ║               ║     2.Bus      ║              ║    3.Train     ║");
            System.out.println("                            ╚════════════════╝               ╚════════════════╝              ╚════════════════╝");
            System.out.println("                                            ╔═════════════════╗               ╔════════════════╗");
            System.out.println("                                            ║    4.Flight     ║               ║     5.Exit     ║");
            System.out.println("                                            ╚═════════════════╝               ╚════════════════╝");
            System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
            des.equal();
            System.out.print("          Select a option: ");
            if (scan.hasNextInt()) 
            {
                vpt = scan.nextInt();
                des.equal();
                break;
            } 
            else 
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch(vpt)
        {
            case 0: 
                bok.opt();
                break;
            case 1:
                vcab();
                break;
            case 2:
                vbus();
                break;
            case 3:
                vtrain();
                break;
            case 4:
                vflight();
                break;
            case 5:
                des.exit();
                break;
            default:
                System.out.println("                           YOU ENTERED A INVALID NO!!!");
                vopt();
                break;
        }
    }
    public void vcab() throws Exception
    {
        try
        {
           fis = new FileInputStream("data/cab.dat");
           dis = new DataInputStream(fis);
        }
        catch(Exception e)
        {
            System.out.println("\n                                                              NO BOOKINGS FOUND");
            bok.opt();
        }
        try
        {
            while(true)
            {
                String vname = dis.readUTF();
                System.out.println("\n");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("                                SMART BOOK");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Passenger     :      "+vname);
                Long vmob = dis.readLong();
                System.out.println("               Mob no        :      "+vmob);
                String vcp = dis.readUTF();
                System.out.println("               Pick Up Point :      "+vcp);
                String vcd = dis.readUTF();
                System.out.println("               Drop Point    :      "+vcd);
                String vcda = dis.readUTF();
                System.out.println("               Booking Date  :      "+vcda);
                String vct = dis.readUTF();
                System.out.println("               Booking Time  :      "+vct);
                System.out.println("           ═════════════════════════════════════════════════════");
                int vcf = dis.readInt();
                System.out.println("               Ride Fare     :      "+vcf);
                System.out.println("           ═════════════════════════════════════════════════════");
            }
        }
        catch(Exception e)
        {
            System.out.println();
            if(fis!=null)
            {
                fis.close();
            }
            bok.opt();
        }
    }
    public void vbus() throws Exception
    {
        int burv;
        while(true)
        {
            des.equal();
            System.out.println("                                                              --VIEW BUS TICKET--");
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
                    vbus();
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
                vicity();
                break;
            case 2:
                vistate();
                break;
            case 3:
                des.exit();
                break;
            default:
                break;
        }
    }
    public void vicity() throws Exception
    {
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
        try {
            while (true) {
                int vbid = dis.readInt();
                System.out.println("\n");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("                                SMART BOOK");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket ID        :      "+vbid);
                String vbname = dis.readUTF();
                System.out.println("               Passenger name   :      "+vbname);
                int vpa = dis.readInt();
                System.out.println("               Passengers       :      "+vpa);
                String vbup = dis.readUTF();
                System.out.println("               Pickup point     :      "+vbup);
                String vbud = dis.readUTF();
                System.out.println("               Drop point       :      "+vbud);
                String vbut = dis.readUTF();
                System.out.println("               Bus time         :      "+vbut);
                long vbm = dis.readLong();
                System.out.println("               Mobile no        :      "+vbm);
                String vbe = dis.readUTF();
                System.out.println("               Email            :      "+vbe);
                int vba = dis.readInt();
                System.out.println("               Age              :      "+vba);
                String vbbd = dis.readUTF();
                System.out.println("               Booking Date     :      "+vbbd);
                String vbbt = dis.readUTF();
                System.out.println("               Booking Time     :      "+vbbt);
                int vbf = dis.readInt();
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket fare      :      "+vbf);
                int vtf = (vbf*vpa);
                System.out.println("               Total fare       :      "+vtf);
                System.out.println("           ═════════════════════════════════════════════════════");
            }
        } catch (Exception e) {
            System.out.println();
            if(fis!=null)
            {
                fis.close();
            }
            bok.opt();
        }
    }
    public void vistate() throws Exception
    {
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
        try 
        {
            while (true) 
            {
                int vbid = dis.readInt();
                System.out.println("\n");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("                                SMART BOOK");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket ID        :      "+vbid);
                String vbname = dis.readUTF();
                System.out.println("               Passenger name   :      "+vbname);
                int vpa = dis.readInt();
                System.out.println("               Passengers       :      "+vpa);
                String vbup = dis.readUTF();
                System.out.println("               Pickup point     :      "+vbup);
                String vbud = dis.readUTF();
                System.out.println("               Drop point       :      "+vbud);
                String vbut = dis.readUTF();
                System.out.println("               Bus time         :      "+vbut);
                long vbm = dis.readLong();
                System.out.println("               Mobile no        :      "+vbm);
                String vbe = dis.readUTF();
                System.out.println("               Email            :      "+vbe);
                int vba = dis.readInt();
                System.out.println("               Age              :      "+vba);
                String vbbd = dis.readUTF();
                System.out.println("               Booking Date     :      "+vbbd);
                String vbbt = dis.readUTF();
                System.out.println("               Booking Time     :      "+vbbt);
                int vbf = dis.readInt();
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket fare      :      "+vbf);
                int vtf = (vbf*vpa);
                System.out.println("               Total fare       :      "+vtf);
                System.out.println("           ═════════════════════════════════════════════════════");
            }
        }
        catch (Exception e) 
        {
            System.out.println();
            if(fis!=null)
            {
                fis.close();
            }
            bok.opt();
        }
    }
    public void vtrain() throws Exception
    {
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
        try 
        {
            while (true) 
            {
                int vbid = dis.readInt();
                System.out.println("\n");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("                                SMART BOOK");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket ID        :      "+vbid);
                String vbname = dis.readUTF();
                System.out.println("               Passenger name   :      "+vbname);
                int vpa = dis.readInt();
                System.out.println("               Passengers       :      "+vpa);
                String vbup = dis.readUTF();
                System.out.println("               Pickup point     :      "+vbup);
                String vbud = dis.readUTF();
                System.out.println("               Drop point       :      "+vbud);
                String vbut = dis.readUTF();
                System.out.println("               Train time       :      "+vbut);
                long vbm = dis.readLong();
                System.out.println("               Mobile no        :      "+vbm);
                long vad = dis.readLong();
                System.out.println("               Aadhar No        :      "+vad);
                String vbe = dis.readUTF();
                System.out.println("               Email            :      "+vbe);
                int vba = dis.readInt();
                System.out.println("               Age              :      "+vba);
                String vbbd = dis.readUTF();
                System.out.println("               Booking Date     :      "+vbbd);
                String vbbt = dis.readUTF();
                System.out.println("               Booking Time     :      "+vbbt);
                int vbf = dis.readInt();
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket fare      :      "+vbf);
                int vtf = (vbf*vpa);
                System.out.println("               Total fare       :      "+vtf);
                System.out.println("           ═════════════════════════════════════════════════════");
            }
        }
        catch (Exception e) 
        {
            System.out.println();
            if(fis!=null)
            {
                fis.close();
            }
            bok.opt();
        }
    }
    public void vflight() throws Exception
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
                    vflight();
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
                vdomes();
                break;
            case 2:
                vinter();
                break;
            case 3:
                bok.opt();
                break;
        }
    }
    public void vdomes() throws Exception
    {
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
        try 
        {
            while (true) 
            {
                int vbid = dis.readInt();
                System.out.println("\n");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("                                SMART BOOK");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket ID        :      "+vbid);
                String vbname = dis.readUTF();
                System.out.println("               Passenger name   :      "+vbname);
                int vpa = dis.readInt();
                System.out.println("               Passengers       :      "+vpa);
                String vbup = dis.readUTF();
                System.out.println("               Pickup point     :      "+vbup);
                String vbud = dis.readUTF();
                System.out.println("               Drop point       :      "+vbud);
                String vbut = dis.readUTF();
                System.out.println("               Flight time      :      "+vbut);
                long vbm = dis.readLong();
                System.out.println("               Mobile no        :      "+vbm);
                String vbe = dis.readUTF();
                System.out.println("               Email            :      "+vbe);
                int vba = dis.readInt();
                System.out.println("               Age              :      "+vba);
                String vbbd = dis.readUTF();
                System.out.println("               Booking Date     :      "+vbbd);
                String vbbt = dis.readUTF();
                System.out.println("               Booking Time     :      "+vbbt);
                int vbf = dis.readInt();
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket fare      :      "+vbf);
                int vtf = (vbf*vpa);
                System.out.println("               Total fare       :      "+vtf);
                System.out.println("           ═════════════════════════════════════════════════════");
            }
        }
        catch (Exception e) 
        {
            System.out.println();
            if(fis!=null)
            {
                fis.close();
            }
            bok.opt();
        }
    }
    public void vinter() throws Exception
    {
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
        try 
        {
            while (true) 
            {
                int vbid = dis.readInt();
                System.out.println("\n");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("                                SMART BOOK");
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket ID        :      "+vbid);
                String vbname = dis.readUTF();
                System.out.println("               Passenger name   :      "+vbname);
                int vpa = dis.readInt();
                System.out.println("               Passengers       :      "+vpa);
                String vbup = dis.readUTF();
                System.out.println("               Pickup point     :      "+vbup);
                String vbud = dis.readUTF();
                System.out.println("               Drop point       :      "+vbud);
                String vbut = dis.readUTF();
                System.out.println("               Train time       :      "+vbut);
                long vbm = dis.readLong();
                System.out.println("               Mobile no        :      "+vbm);
                String vbe = dis.readUTF();
                System.out.println("               Email            :      "+vbe);
                int vba = dis.readInt();
                System.out.println("               Age              :      "+vba);
                String nt = dis.readUTF();
                System.out.println("               Nationality      :      "+nt);
                String pas = dis.readUTF();
                System.out.println("               Passport No      :      "+pas);
                String vis = dis.readUTF();
                System.out.println("               Visa No          :      "+vis);
                String vbbd = dis.readUTF();
                System.out.println("               Booking Date     :      "+vbbd);
                String vbbt = dis.readUTF();
                System.out.println("               Booking Time     :      "+vbbt);
                int vbf = dis.readInt();
                System.out.println("           ═════════════════════════════════════════════════════");
                System.out.println("               Ticket fare      :      "+vbf);
                int vtf = (vbf*vpa);
                System.out.println("               Total fare       :      "+vtf);
                System.out.println("           ═════════════════════════════════════════════════════");
            }
        }
        catch (Exception e) 
        {
            System.out.println();
            if(fis!=null)
            {
                fis.close();
            }
            bok.opt();
        }
    }
    public static void main(String[] args) throws Exception {
        
    }
}
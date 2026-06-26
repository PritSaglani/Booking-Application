import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class booking{
    Scanner scan = new Scanner(System.in);
    designs des = new designs();
    view vi;
    search sti;
    LocalDate date = LocalDate.now(); 
    LocalTime time = LocalTime.now();
    ArrayList<String> Gj = new ArrayList<String>();
    ArrayList<String> Rj = new ArrayList<String>();
    ArrayList<String> MH = new ArrayList<String>();
    ArrayList<String> KA = new ArrayList<String>();
    ArrayList<String> Up = new ArrayList<String>();
    ArrayList<String> MP = new ArrayList<String>();
    ArrayList<String> PB = new ArrayList<String>();
    ArrayList<String> Ch = new ArrayList<String>();
    ArrayList<String> TN = new ArrayList<String>();
    ArrayList<String> Wb = new ArrayList<String>();
    ArrayList<String> Train = new ArrayList<String>();
    ArrayList<String> Df = new ArrayList<String>();
    ArrayList<String> Inf = new ArrayList<String>();
    ArrayList<String> Is = new ArrayList<String>();
    ArrayList<String> tim = new ArrayList<String>();
    FileOutputStream fos;
    FileOutputStream fos2;
    DataOutputStream dos2;
    DataOutputStream dos;
    FileInputStream fis;
    DataInputStream dis;
    public void opt() throws Exception{
        int op;
        while (true) {
            vi = new view();
            sti = new search();
            System.err.println("\n");
            des.equal();
            System.out.println("                                                              --DASHBOARD--");
            des.equal();
            System.out.println("                                          ╔═════════════════╗                ╔════════════════╗");
            System.out.println("                                          ║  1.Book Ticket  ║                ║  2.View Ticket ║");
            System.out.println("                                          ╚═════════════════╝                ╚════════════════╝");
            System.out.println("                                          ╔═════════════════╗                ╔════════════════╗");
            System.out.println("                                          ║ 3.Search Ticket ║                ║     4.Exit     ║");
            System.out.println("                                          ╚═════════════════╝                ╚════════════════╝");
            des.equal();
            System.out.print("          Select a option: ");
            if (scan.hasNextInt()) {
                op = scan.nextInt();
                break;
            } else {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch (op) {
            case 1:
                book();
                break;
            case 2:
                vi.vopt();
                break;
            case 3:
                sti.sopt();
                break;
            case 4:
                des.exit();
                break;
            default:
                System.out.println("                           YOU ENTERED A INVALID NO");
                opt();
                break;
        }
    }
    public void tim()
    {
        tim.add("1:00");
        tim.add("3:00");
        tim.add("5:00");
        tim.add("7:00");
        tim.add("9:00");
        tim.add("11:00");
        tim.add("13:00");
        tim.add("15:00");
        tim.add("17:00");
        tim.add("19:00");
        tim.add("21:00");
        tim.add("23:00");
         System.out.println("                                                              --SCHEDULE--");
            des.equal();
            System.out.println("                                                       ╔═════════════════════╗");
            System.out.println("                                                       ║   Available Timing  ║");
            System.out.println("                                                       ║═════════════════════║");
            System.out.println("                                                       ║       1) " +tim.get(0)+"       ║");
            System.out.println("                                                       ║       2) " +tim.get(1)+"       ║");
            System.out.println("                                                       ║       3) " +tim.get(2)+"       ║");
            System.out.println("                                                       ║       4) " +tim.get(3)+"       ║");
            System.out.println("                                                       ║       5) " +tim.get(4)+"       ║");
            System.out.println("                                                       ║       6) " +tim.get(5)+"      ║");
            System.out.println("                                                       ║       7) " +tim.get(6)+"      ║");
            System.out.println("                                                       ║       8) " +tim.get(7)+"      ║");
            System.out.println("                                                       ║       9) " +tim.get(8)+"      ║");
            System.out.println("                                                       ║      10) " +tim.get(9)+"      ║");
            System.out.println("                                                       ║      11) " +tim.get(10)+"      ║");
            System.out.println("                                                       ║      12) " +tim.get(11)+"      ║");
            System.out.println("                                                       ╚═════════════════════╝");
            des.equal();
    }
    public void book() throws Exception {
        System.out.println("\n");
        int bopt;
        while (true) {
            des.equal();
            System.out.println("                                                              --BOOK TICKET--");
            des.equal();
            System.out.println("                            ╔════════════════╗               ╔════════════════╗              ╔════════════════╗");
            System.out.println("                            ║   1.Book Cab   ║               ║  2.Bus Ticket  ║              ║ 3.Train Ticket ║");
            System.out.println("                            ╚════════════════╝               ╚════════════════╝              ╚════════════════╝");
            System.out.println("                                            ╔═════════════════╗               ╔════════════════╗");
            System.out.println("                                            ║ 4.Flight ticket ║               ║     5.Exit     ║");
            System.out.println("                                            ╚═════════════════╝               ╚════════════════╝");
            System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
            des.equal();
            System.out.print("          Select a option: ");
            if (scan.hasNextInt()) {
                bopt = scan.nextInt();
                break;
            } else {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch (bopt) {
            case 0:
                opt();
                break;
            case 1:
                cab();
                break;
            case 2:
                bus();
                break;
            case 3:
                traint();
                break;
            case 4:
                flight();
                break;
            case 5:
                des.exit();
                break;
            default:
                System.out.println("                           YOU ENTERED A INVALID NO!!!");
                book();
                break;
        }
    }
    public void cab() throws Exception {
        System.out.println("\n");
        int cacit;
        while (true) {
            des.equal();
            System.out.println("                                                              --BOOK CAB--");
            des.equal();
            System.out.println("                                                       ╔═════════════════════╗");
            System.out.println("                                                       ║   Available Cities  ║");
            System.out.println("                                                       ║═════════════════════║");
            System.out.println("                                                       ║      1.Rajkot       ║");
            System.out.println("                                                       ║      2.Ahmedabad    ║");
            System.out.println("                                                       ║      3.Surat        ║");
            System.out.println("                                                       ║      4.Baroda       ║");
            System.out.println("                                                       ║      5.Jamnagar     ║");
            System.out.println("                                                       ╚═════════════════════╝");
            System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
            System.out.println();
            des.equal();
            System.out.print("          Select City: ");
            if(scan.hasNextInt())
            {
                cacit = scan.nextInt();
                if(cacit == 0)
                {
                    opt();
                    break;
                }
                else if(cacit>0 && cacit<=5)
                {
                    cabo();
                    break;
                }
                else
                {
                    System.out.println();
                    System.out.println("                                                      PLEASE SELECT BETWEEN 1 TO 5");
                    System.out.println("\n\n");
                }
                
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }   
    }
    public void bus() throws Exception
    {
        System.out.println("\n");
        int buro;
        while(true)
        {
            des.equal();
            System.out.println("                                                              --BUS TICKET--");
            des.equal();
            System.out.println("                            ╔════════════════╗               ╔════════════════╗              ╔════════════════╗");
            System.out.println("                            ║  1.Inter City  ║               ║  2.Inter State ║              ║     3.Exit     ║");
            System.out.println("                            ╚════════════════╝               ╚════════════════╝              ╚════════════════╝");
            System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
            des.equal();
            System.out.print("          Select a option: ");
            if(scan.hasNextInt())
            {
                buro = scan.nextInt();
                if(buro!=1 && buro!=2 && buro!=3)
                {
                    System.out.println("                           YOU SELECTED WRONG NUMBER");
                    bus();
                }
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        } 
        switch(buro)
        {
            case 0:
                opt();
                break;
            case 1:
                icity();
                break;
            case 2:
                istate();
                break;
            case 3:
                des.exit();
                break;
            default:
                System.out.println("                           YOU ENTERED A INVALID NO!!!");
                break;
        }
    }
    public void icity() throws Exception
    {       
           //Gujarat 
            Gj.add("Rajkot");
            Gj.add("Ahemdabad");
            Gj.add("Surat");
            Gj.add("Junagadh");
            Gj.add("Gandhinagar");
            Gj.add("Porbandar");
            Gj.add("Surendranagar");
            Gj.add("Vadodara");
            Gj.add("Anand");
            Gj.add("Amreli");
            //rajasthan
            Rj.add("Jaipur");
            Rj.add("Jodhpur");
            Rj.add("Udaipur");
            Rj.add("Jaisalmer");
            Rj.add("Ajmer");
            Rj.add("Bikaner");
            Rj.add("Kota");
            Rj.add("Alwar");
            Rj.add("Bharatpur");
            Rj.add("Bhilwara");
            //maharashtra
            MH.add("Mumbai");
            MH.add("Pune");
            MH.add("Thane");
            MH.add("Nashik");
            MH.add("Aurangabad");
            MH.add("Bid");
            MH.add("Solapur");
            MH.add("Akola");
            MH.add("Amravati");
            MH.add("Nagpur");
            //karnataka
            KA.add("Bengaluru");
            KA.add("Mysore");
            KA.add("Dharwad");
            KA.add("Kalaburagi");
            KA.add("Mangaluru");
            KA.add("Belagivi");
            KA.add("Vijaypura");
            KA.add("Shimoga");
            KA.add("Tumkur");
            KA.add("Raichur");
            //uttar pradesh
            Up.add("Lucknow");
            Up.add("Agra");
            Up.add("Prayagraj");
            Up.add("Kanpur");
            Up.add("Varanasi");
            Up.add("Meerut");
            Up.add("Ghaziabad");
            Up.add("Aligargh");
            Up.add("Noida");
            Up.add("Ayodhya");
            //madhya pradesh
            MP.add("Indore");
            MP.add("Bhopal");
            MP.add("Jabalpur");
            MP.add("Gwallior");
            MP.add("Ujjain");
            MP.add("Sagar");
            MP.add("Satna");
            MP.add("Shivpuri");
            MP.add("Rattam");
            MP.add("Burhanpur");
            //punjab
            PB.add("Ludhiana");
            PB.add("Amritsar");
            PB.add("Jalandhar");
            PB.add("Patiala");
            PB.add("Bathinda");
            PB.add("Mohali");
            PB.add("Sangrur");
            PB.add("Khanna");
            PB.add("Phagwara");
            PB.add("Hoshiarpur");
            //chattisgarh
            Ch.add("Raipur");
            Ch.add("Bhilai-Durg");
            Ch.add("Bilaspur");
            Ch.add("Korba");
            Ch.add("Jagdalpur");
            Ch.add("Ambikapur");
            Ch.add("Rajnandgaon");
            Ch.add("Dhamtari");
            Ch.add("Champa");
            Ch.add("Mahasamund");
            //tamil nadu
            TN.add("Chennai");
            TN.add("Madurai");
            TN.add("Coimbatore");
            TN.add("Salem");
            TN.add("Ambattur");
            TN.add("Tiruppur");
            TN.add("Avadi");
            TN.add("Vellore");
            TN.add("Erode");
            TN.add("Alandur");
            //west bengal
            Wb.add("Kolkata");
            Wb.add("Asansol");
            Wb.add("Siliguri");
            Wb.add("Durgapur");
            Wb.add("Malda");
            Wb.add("Halaia");
            Wb.add("Shantipur");
            Wb.add("Dankuni");
            Wb.add("Dhulian");
            Wb.add("Raiganj");
            System.out.println("\n");
            int icop;
        while(true)
        {    
            des.equal();
            System.out.println("                                                              --INTER CITY--");
            des.equal();
            System.out.println("                                                       ╔═════════════════════╗");
            System.out.println("                                                       ║   Available States  ║");
            System.out.println("                                                       ║═════════════════════║");
            System.out.println("                                                       ║   1.Gujarat         ║");
            System.out.println("                                                       ║   2.Rajasthan       ║");
            System.out.println("                                                       ║   3.Maharashtra     ║");
            System.out.println("                                                       ║   4.Karnataka       ║");
            System.out.println("                                                       ║   5.Uttar Pradesh   ║");
            System.out.println("                                                       ║   6.Madhya Pradesh  ║");
            System.out.println("                                                       ║   7.Punjab          ║");
            System.out.println("                                                       ║   8.Chattisgarh     ║");
            System.out.println("                                                       ║   9.Tamil Nadu      ║");
            System.out.println("                                                       ║   10.West Bengal    ║");
            System.out.println("                                                       ╚═════════════════════╝");
            System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
            des.equal();
            System.out.print("          Select State: ");
            if(scan.hasNextInt()) 
            {
                icop = scan.nextInt();
                if(icop>=0 && icop<=10)
                {
                    break;
                }
                else
                {
                    des.equal();
                    System.out.println("\n");
                    des.equal();
                    System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                    des.equal();
                    System.out.println("\n");
                }
                
            } 
            else 
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch(icop)
        {
            case 0:
                opt();
                break;
            case 1:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --GUJARAT--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+Gj.get(0)+"             ║         1."+Gj.get(0)+"              ║");
                System.out.println("                                     ║         2."+Gj.get(1)+"          ║         2."+Gj.get(1)+"           ║");                                           
                System.out.println("                                     ║         3."+Gj.get(2)+"              ║         3."+Gj.get(2)+"               ║");
                System.out.println("                                     ║         4."+Gj.get(3)+"           ║         4."+Gj.get(3)+"            ║");
                System.out.println("                                     ║         5."+Gj.get(4)+"        ║         5."+Gj.get(4)+"         ║");
                System.out.println("                                     ║         6."+Gj.get(5)+"          ║         6."+Gj.get(5)+"           ║");
                System.out.println("                                     ║         7."+Gj.get(6)+"      ║         7."+Gj.get(6)+"       ║");
                System.out.println("                                     ║         8."+Gj.get(7)+"           ║         8."+Gj.get(7)+"            ║");
                System.out.println("                                     ║         9."+Gj.get(8)+"              ║         9."+Gj.get(8)+"               ║");
                System.out.println("                                     ║         10."+Gj.get(9)+"            ║         10."+Gj.get(9)+"             ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 2:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --RAJASTHAN--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+Rj.get(0)+"             ║         1."+Rj.get(0)+"              ║");
                System.out.println("                                     ║         2."+Rj.get(1)+"            ║         2."+Rj.get(1)+"             ║");                                           
                System.out.println("                                     ║         3."+Rj.get(2)+"            ║         3."+Rj.get(2)+"             ║");
                System.out.println("                                     ║         4."+Rj.get(3)+"          ║         4."+Rj.get(3)+"           ║");
                System.out.println("                                     ║         5."+Rj.get(4)+"              ║         5."+Rj.get(4)+"               ║");
                System.out.println("                                     ║         6."+Rj.get(5)+"            ║         6."+Rj.get(5)+"             ║");
                System.out.println("                                     ║         7."+Rj.get(6)+"               ║         7."+Rj.get(6)+"                ║");
                System.out.println("                                     ║         8."+Rj.get(7)+"              ║         8."+Rj.get(7)+"               ║");
                System.out.println("                                     ║         9."+Rj.get(8)+"          ║         9."+Rj.get(8)+"           ║");
                System.out.println("                                     ║         10."+Rj.get(9)+"          ║         10."+Rj.get(9)+"           ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 3:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --MAHARASHTRA--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+MH.get(0)+"             ║         1."+MH.get(0)+"              ║");
                System.out.println("                                     ║         2."+MH.get(1)+"               ║         2."+MH.get(1)+"                ║");                                           
                System.out.println("                                     ║         3."+MH.get(2)+"              ║         3."+MH.get(2)+"               ║");
                System.out.println("                                     ║         4."+MH.get(3)+"             ║         4."+MH.get(3)+"              ║");
                System.out.println("                                     ║         5."+MH.get(4)+"         ║         5."+MH.get(4)+"          ║");
                System.out.println("                                     ║         6."+MH.get(5)+"                ║         6."+MH.get(5)+"                 ║");
                System.out.println("                                     ║         7."+MH.get(6)+"            ║         7."+MH.get(6)+"             ║");
                System.out.println("                                     ║         8."+MH.get(7)+"              ║         8."+MH.get(7)+"               ║");
                System.out.println("                                     ║         9."+MH.get(8)+"           ║         9."+MH.get(8)+"            ║");
                System.out.println("                                     ║         10."+MH.get(9)+"            ║         10."+MH.get(9)+"             ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝");
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD"); 
                des.equal();
                buso(icop);
                break;
            case 4:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --KARNATAKA--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+KA.get(0)+"          ║         1."+KA.get(0)+"           ║");
                System.out.println("                                     ║         2."+KA.get(1)+"             ║         2."+KA.get(1)+"              ║");                                           
                System.out.println("                                     ║         3."+KA.get(2)+"            ║         3."+KA.get(2)+"             ║");
                System.out.println("                                     ║         4."+KA.get(3)+"         ║         4."+KA.get(3)+"          ║");
                System.out.println("                                     ║         5."+KA.get(4)+"          ║         5."+KA.get(4)+"           ║");
                System.out.println("                                     ║         6."+KA.get(5)+"           ║         6."+KA.get(5)+"            ║");
                System.out.println("                                     ║         7."+KA.get(6)+"          ║         7."+KA.get(6)+"           ║");
                System.out.println("                                     ║         8."+KA.get(7)+"            ║         8."+KA.get(7)+"             ║");
                System.out.println("                                     ║         9."+KA.get(8)+"             ║         9."+KA.get(8)+"              ║");
                System.out.println("                                     ║         10."+KA.get(9)+"           ║         10."+KA.get(9)+"            ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 5:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --UTTAR PRADESH--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+Up.get(0)+"            ║         1."+Up.get(0)+"             ║");
                System.out.println("                                     ║         2."+Up.get(1)+"               ║         2."+Up.get(1)+"                ║");                                           
                System.out.println("                                     ║         3."+Up.get(2)+"          ║         3."+Up.get(2)+"           ║");
                System.out.println("                                     ║         4."+Up.get(3)+"             ║         4."+Up.get(3)+"              ║");
                System.out.println("                                     ║         5."+Up.get(4)+"           ║         5."+Up.get(4)+"            ║");
                System.out.println("                                     ║         6."+Up.get(5)+"             ║         6."+Up.get(5)+"              ║");
                System.out.println("                                     ║         7."+Up.get(6)+"          ║         7."+Up.get(6)+"           ║");
                System.out.println("                                     ║         8."+Up.get(7)+"           ║         8."+Up.get(7)+"            ║");
                System.out.println("                                     ║         9."+Up.get(8)+"              ║         9."+Up.get(8)+"               ║");
                System.out.println("                                     ║         10."+Up.get(9)+"           ║         10."+Up.get(9)+"            ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 6:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --MADHYA PRADESH--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+MP.get(0)+"             ║         1."+MP.get(0)+"              ║");
                System.out.println("                                     ║         2."+MP.get(1)+"             ║         2."+MP.get(1)+"              ║");                                           
                System.out.println("                                     ║         3."+MP.get(2)+"           ║         3."+MP.get(2)+"            ║");
                System.out.println("                                     ║         4."+MP.get(3)+"           ║         4."+MP.get(3)+"            ║");
                System.out.println("                                     ║         5."+MP.get(4)+"             ║         5."+MP.get(4)+"              ║");
                System.out.println("                                     ║         6."+MP.get(5)+"              ║         6."+MP.get(5)+"               ║");
                System.out.println("                                     ║         7."+MP.get(6)+"              ║         7."+MP.get(6)+"               ║");
                System.out.println("                                     ║         8."+MP.get(7)+"           ║         8."+MP.get(7)+"            ║");
                System.out.println("                                     ║         9."+MP.get(8)+"             ║         9."+MP.get(8)+"              ║");
                System.out.println("                                     ║         10."+MP.get(9)+"         ║         10."+MP.get(9)+"          ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 7:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --PUNJAB--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+PB.get(0)+"           ║         1."+PB.get(0)+"            ║");
                System.out.println("                                     ║         2."+PB.get(1)+"           ║         2."+PB.get(1)+"            ║");                                           
                System.out.println("                                     ║         3."+PB.get(2)+"          ║         3."+PB.get(2)+"           ║");
                System.out.println("                                     ║         4."+PB.get(3)+"            ║         4."+PB.get(3)+"             ║");
                System.out.println("                                     ║         5."+PB.get(4)+"           ║         5."+PB.get(4)+"            ║");
                System.out.println("                                     ║         6."+PB.get(5)+"             ║         6."+PB.get(5)+"              ║");
                System.out.println("                                     ║         7."+PB.get(6)+"            ║         7."+PB.get(6)+"             ║");
                System.out.println("                                     ║         8."+PB.get(7)+"             ║         8."+PB.get(7)+"              ║");
                System.out.println("                                     ║         9."+PB.get(8)+"           ║         9."+PB.get(8)+"            ║");
                System.out.println("                                     ║         10."+PB.get(9)+"        ║         10."+PB.get(9)+"         ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 8:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --CHATTISGARH--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+Ch.get(0)+"             ║         1."+Ch.get(0)+"              ║");
                System.out.println("                                     ║         2."+Ch.get(1)+"        ║         2."+Ch.get(1)+"         ║");                                           
                System.out.println("                                     ║         3."+Ch.get(2)+"           ║         3."+Ch.get(2)+"            ║");
                System.out.println("                                     ║         4."+Ch.get(3)+"              ║         4."+Ch.get(3)+"               ║");
                System.out.println("                                     ║         5."+Ch.get(4)+"          ║         5."+Ch.get(4)+"           ║");
                System.out.println("                                     ║         6."+Ch.get(5)+"          ║         6."+Ch.get(5)+"           ║");
                System.out.println("                                     ║         7."+Ch.get(6)+"        ║         7."+Ch.get(6)+"         ║");
                System.out.println("                                     ║         8."+Ch.get(7)+"           ║         8."+Ch.get(7)+"            ║");
                System.out.println("                                     ║         9."+Ch.get(8)+"             ║         9."+Ch.get(8)+"              ║");
                System.out.println("                                     ║         10."+Ch.get(9)+"        ║         10."+Ch.get(9)+"         ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 9:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --TAMIL NADU--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+TN.get(0)+"            ║         1."+TN.get(0)+"             ║");
                System.out.println("                                     ║         2."+TN.get(1)+"            ║         2."+TN.get(1)+"             ║");                                           
                System.out.println("                                     ║         3."+TN.get(2)+"         ║         3."+TN.get(2)+"          ║");
                System.out.println("                                     ║         4."+TN.get(3)+"              ║         4."+TN.get(3)+"               ║");
                System.out.println("                                     ║         5."+TN.get(4)+"           ║         5."+TN.get(4)+"            ║");
                System.out.println("                                     ║         6."+TN.get(5)+"           ║         6."+TN.get(5)+"            ║");
                System.out.println("                                     ║         7."+TN.get(6)+"              ║         7."+TN.get(6)+"               ║");
                System.out.println("                                     ║         8."+TN.get(7)+"            ║         8."+TN.get(7)+"             ║");
                System.out.println("                                     ║         9."+TN.get(8)+"              ║         9."+TN.get(8)+"               ║");
                System.out.println("                                     ║         10."+TN.get(9)+"           ║         10."+TN.get(9)+"            ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            case 10:
                System.out.println("\n");
                des.equal();
                System.out.println("                                                              --WEST BENGAL--");
                des.equal();
                System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
                System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
                System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
                System.out.println("                                     ║         1."+Wb.get(0)+"            ║         1."+Wb  .get(0)+"             ║");
                System.out.println("                                     ║         2."+Wb.get(1)+"            ║         2."+Wb.get(1)+"             ║");                                           
                System.out.println("                                     ║         3."+Wb.get(2)+"           ║         3."+Wb.get(2)+"            ║");
                System.out.println("                                     ║         4."+Wb.get(3)+"           ║         4."+Wb.get(3)+"            ║");
                System.out.println("                                     ║         5."+Wb.get(4)+"              ║         5."+Wb.get(4)+"               ║");
                System.out.println("                                     ║         6."+Wb.get(5)+"             ║         6."+Wb.get(5)+"              ║");
                System.out.println("                                     ║         7."+Wb.get(6)+"          ║         7."+Wb.get(6)+"           ║");
                System.out.println("                                     ║         8."+Wb.get(7)+"            ║         8."+Wb.get(7)+"             ║");
                System.out.println("                                     ║         9."+Wb.get(8)+"            ║         9."+Wb.get(8)+"             ║");
                System.out.println("                                     ║         10."+Wb.get(9)+"           ║         10."+Wb.get(9)+"            ║");
                System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
                System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
                des.equal();
                buso(icop);
                break;
            default:
                System.out.println("                           YOU ENTERED A INVALID NO!!!");
                break;
        }
       
    }
    public void istate() throws Exception
    {
        Is.add("Rajkot(GJ)");
        Is.add("Amritsar( PB)");
        Is.add("Patna(BR)");
        Is.add("Shimla(HP)");
        Is.add("Ranchi(JH)");
        Is.add("Bengaluru(KA)");
        Is.add("Bhopal(MP)");
        Is.add("Mumbai(MH)");
        Is.add("Shillong(ML)");
        Is.add("Bhubaneswar(OD)");
        Is.add("Jaipur(RJ)");
        Is.add("Chennai(TN)");
        Is.add("Hyderabad(TG)");
        Is.add("Lucknow(UP)");
        Is.add("Dehradun(UK)");
        System.out.println("\n");
        des.equal();
        System.out.println("                                                              --INTER STATE--");
        des.equal();
        System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
        System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
        System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
        System.out.println("                                     ║         1."+Is.get(0)+"         ║         1."+Is.get(0)+"          ║");
        System.out.println("                                     ║         2."+Is.get(1)+"      ║         2."+Is.get(1)+"       ║");                                           
        System.out.println("                                     ║         3."+Is.get(2)+"          ║         3."+Is.get(2)+"           ║");
        System.out.println("                                     ║         4."+Is.get(3)+"         ║         4."+Is.get(3)+"          ║");
        System.out.println("                                     ║         5."+Is.get(4)+"         ║         5."+Is.get(4)+"          ║");
        System.out.println("                                     ║         6."+Is.get(5)+"      ║         6."+Is.get(5)+"       ║");
        System.out.println("                                     ║         7."+Is.get(6)+"         ║         7."+Is.get(6)+"          ║");
        System.out.println("                                     ║         8."+Is.get(7)+"         ║         8."+Is.get(7)+"          ║");
        System.out.println("                                     ║         9."+Is.get(8)+"       ║         9."+Is.get(8)+"        ║");
        System.out.println("                                     ║         10."+Is.get(9)+"   ║         10."+Is.get(9)+"    ║");
        System.out.println("                                     ║         11."+Is.get(10)+"        ║         11."+Is.get(10)+"         ║");
        System.out.println("                                     ║         12."+Is.get(11)+"       ║         12."+Is.get(11)+"        ║");
        System.out.println("                                     ║         13."+Is.get(12)+"     ║         13."+Is.get(12)+"      ║");
        System.out.println("                                     ║         14."+Is.get(13)+"       ║         14."+Is.get(13)+"        ║");
        System.out.println("                                     ║         15."+Is.get(14)+"      ║         15."+Is.get(14)+"       ║");
        System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
        System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
        des.equal();
        busst();
    }
    public void traint() throws Exception
    {
        Train.add("Rajkot(GJ)");
        Train.add("Lucknow(UP)");
        Train.add("Jaipur(RJ)");
        Train.add("Mumbai(MH)");
        Train.add("Siliguri(Is)");
        Train.add("Chennai(TN)");
        Train.add("Amristar(PB)");
        Train.add("Ahemedabad(GJ)");
        Train.add("Agra(UP)");
        Train.add("Raipur(CK)");
        Train.add("Indore(MP)");
        Train.add("Udaipur(RJ)");
        Train.add("Bhilai(CK)");
        Train.add("Bhopal(MP)");
        Train.add("Bengaluru(KA)");
        Train.add("Vellore(TN)");
        Train.add("Ludhiana(PB)");
        Train.add("Pune(MH)");
        Train.add("Kolkata(Is)");
        Train.add("Mysore(KA)");
        System.out.println("\n");
        des.equal();
        System.out.println("                                                              --Train Ticket--");
        des.equal();
        System.out.println("                                     ╔══════════════════════════════╦═══════════════════════════════╗");
        System.out.println("                                     ║       PICK UP STATION        ║          DROP STATION         ║");
        System.out.println("                                     ╠══════════════════════════════╬═══════════════════════════════╣");
        System.out.println("                                     ║         1."+Train.get(0)+"         ║         1."+Train.get(0)+"          ║");
        System.out.println("                                     ║         2."+Train.get(1)+"        ║         2."+Train.get(1)+"         ║");                                           
        System.out.println("                                     ║         3."+Train.get(2)+"         ║         3."+Train.get(2)+"          ║");
        System.out.println("                                     ║         4."+Train.get(3)+"         ║         4."+Train.get(3)+"          ║");
        System.out.println("                                     ║         5."+Train.get(4)+"       ║         5."+Train.get(4)+"        ║");
        System.out.println("                                     ║         6."+Train.get(5)+"        ║         6."+Train.get(5)+"         ║");
        System.out.println("                                     ║         7."+Train.get(6)+"       ║         7."+Train.get(6)+"        ║");
        System.out.println("                                     ║         8."+Train.get(7)+"     ║         8."+Train.get(7)+"      ║");
        System.out.println("                                     ║         9."+Train.get(8)+"           ║         9."+Train.get(8)+"            ║");
        System.out.println("                                     ║         10."+Train.get(9)+"        ║         10."+Train.get(9)+"         ║");
        System.out.println("                                     ║         11."+Train.get(10)+"        ║         11."+Train.get(10)+"         ║");
        System.out.println("                                     ║         12."+Train.get(11)+"       ║         12."+Train.get(11)+"        ║");
        System.out.println("                                     ║         13."+Train.get(12)+"        ║         13."+Train.get(12)+"         ║");
        System.out.println("                                     ║         14."+Train.get(13)+"        ║         14."+Train.get(13)+"         ║");
        System.out.println("                                     ║         15."+Train.get(14)+"     ║         15."+Train.get(14)+"      ║");
        System.out.println("                                     ║         16."+Train.get(15)+"       ║         16."+Train.get(15)+"        ║");
        System.out.println("                                     ║         17."+Train.get(16)+"      ║         17."+Train.get(16)+"       ║");
        System.out.println("                                     ║         18."+Train.get(17)+"          ║         18."+Train.get(17)+"           ║");
        System.out.println("                                     ║         19."+Train.get(18)+"       ║         19."+Train.get(18)+"        ║");
        System.out.println("                                     ║         20."+Train.get(19)+"        ║         20."+Train.get(19)+"         ║");
        System.out.println("                                     ╚══════════════════════════════╩═══════════════════════════════╝"); 
        System.out.println("     ENTER 0 TO RETURN TO DASHBOARD");
        des.equal();
        trainn();
    }
    public void flight() throws Exception
    {
        int fop;
        while(true)
        {
            System.out.println("\n");
            des.equal();
            System.out.println("                                                              --FLIGHT TICKET--");
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
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch (fop)
        {
                case 1:
                    domestic();
                    flid(fop);
                    break;
                case 2:
                    international();
                    flid(fop);
                    break;
                case 3:
                    des.exit();
                    break;
                default:
                    System.out.println("                           YOU ENTERED A INVALID NO!!!");
                    break;       
        }
    }
    public void domestic() throws Exception
    {
         Df.add("Indira Gandhi International airport(Delhi)");
         Df.add("Chhatrapati Shivaji Maharaj airport(Maharastra)");
         Df.add("Kempegowda International airport(Bengaluru))");
         Df.add("Rajiv Gandhi International Airport(Telangana)");
         Df.add("Chennai International airport(Tamil Nadu)");
         Df.add("Netaji Subhas Chandra Bose airport(West Bengal)");
         Df.add("Sardar Vallabhai Patel airport(Gujarat)");
         Df.add("Cochin International Airport(Kerela)");
         Df.add("Goa International airport(Goa)");
         Df.add("Jaipur International airport(Rajasthan)");
         Df.add("Lucknow airport(Uttar Pradesh)");
         Df.add("Visakhapatnam airport(Andhra Pradesh)");
         Df.add("Lokpriya Gopinath Bordoloi airport(Assam)");
         Df.add("Sri Guru Ram Dass Jee airport(Punjab)");
         Df.add("Jeypore airport(Orissa)");
         System.out.println("\n");
         des.equal();
         System.out.println("                                                              --DOMESTIC FLIGHT--");
         des.equal();
         System.out.println("               ╔═══════════════════════════════════════════════════════╦════════════════════════════════════════════════════════╗");
         System.out.println("               ║                    PICK UP STATION                    ║                      DROP STATION                      ║");
         System.out.println("               ╠═══════════════════════════════════════════════════════╬════════════════════════════════════════════════════════╣");
         System.out.println("               ║    1."+Df.get(0)+"       ║    1."+Df.get(0)+"        ║");
         System.out.println("               ║    2."+Df.get(1)+"  ║    2."+Df.get(1)+"   ║");                                           
         System.out.println("               ║    3."+Df.get(2)+"     ║    3."+Df.get(2)+"      ║");
         System.out.println("               ║    4."+Df.get(3)+"    ║    4."+Df.get(3)+"     ║");
         System.out.println("               ║    5."+Df.get(4)+"        ║    5."+Df.get(4)+"         ║");
         System.out.println("               ║    6."+Df.get(5)+"  ║    6."+Df.get(5)+"   ║");
         System.out.println("               ║    7."+Df.get(6)+"          ║    7."+Df.get(6)+"           ║");
         System.out.println("               ║    8."+Df.get(7)+"             ║    8."+Df.get(7)+"              ║");
         System.out.println("               ║    9."+Df.get(8)+"                   ║    9."+Df.get(8)+"                    ║");
         System.out.println("               ║    10."+Df.get(9)+"         ║    10."+Df.get(9)+"          ║");
         System.out.println("               ║    11."+Df.get(10)+"                  ║    11."+Df.get(10)+"                   ║");
         System.out.println("               ║    12."+Df.get(11)+"           ║    12."+Df.get(11)+"            ║");
         System.out.println("               ║    13."+Df.get(12)+"       ║    13."+Df.get(12)+"        ║");
         System.out.println("               ║    14."+Df.get(13)+"           ║    14."+Df.get(13)+"            ║");
         System.out.println("               ║    15."+Df.get(14)+"                         ║    15."+Df.get(14)+"                          ║");
         System.out.println("               ╚═══════════════════════════════════════════════════════╩════════════════════════════════════════════════════════╝"); 
         System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
         des.equal();
    }
    public void international()
    {
         Inf.add("Hartsfield-Jackson Atlanta airport(US)");
         Inf.add("London Heathrow airport(United Kingdom)");
         Inf.add("Dubai International airport(UAE)");
         Inf.add("Tokyo Haneda airport(Japan)");
         Inf.add("Indira Gandhi International airport(New Delhi)");
         Inf.add("Singapore Changi airport(Singapore)");
         Inf.add("Istanbul Airport(Turkey)");
         Inf.add("Paris Charles De Gaule Airport(France)");
         Inf.add("Frankfurt airport(Germany)");
         Inf.add("Sydney Kingsford Smith airport(Australia)");
         Inf.add("Toranto Pearson International airport(Canada)");
         Inf.add("Beijing Capital International airport(China)");
         Inf.add("Doha Hamad International airport(Qatar)");
         Inf.add("Amsterdam airport Schiphol(Netherlands)");
         Inf.add("Incheon International airport(South Korea)");
         Inf.add("Madrid Bajaras Airport(Spain)");
         Inf.add("Rome Fimicino airport(Italy)");
         Inf.add("Kuala Lumpur International airport(Malaysia)");
         Inf.add("Sao Paulo/Guarulhos International airport(Brazil)");
         Inf.add("Cairo International airport(Egypt)");
         System.out.println("\n");
         des.equal();
         System.out.println("                                                            --INTERNATIONAL FLIGHT--");
         des.equal();
         System.out.println("               ╔═══════════════════════════════════════════════════════╦════════════════════════════════════════════════════════╗");
         System.out.println("               ║                    PICK UP STATION                    ║                      DROP STATION                      ║");
         System.out.println("               ╠═══════════════════════════════════════════════════════╬════════════════════════════════════════════════════════╣");
         System.out.println("               ║    1."+Inf.get(0)+"           ║    1."+Inf.get(0)+"            ║");
         System.out.println("               ║    2."+Inf.get(1)+"          ║    2."+Inf.get(1)+"           ║");                                           
         System.out.println("               ║    3."+Inf.get(2)+"                 ║    3."+Inf.get(2)+"                  ║");
         System.out.println("               ║    4."+Inf.get(3)+"                      ║    4."+Inf.get(3)+"                       ║");
         System.out.println("               ║    5."+Inf.get(4)+"   ║    5."+Inf.get(4)+"    ║");
         System.out.println("               ║    6."+Inf.get(5)+"              ║    6."+Inf.get(5)+"               ║");
         System.out.println("               ║    7."+Inf.get(6)+"                         ║    7."+Inf.get(6)+"                          ║");
         System.out.println("               ║    8."+Inf.get(7)+"           ║    8."+Inf.get(7)+"            ║");
         System.out.println("               ║    9."+Inf.get(8)+"                       ║    9."+Inf.get(8)+"                        ║");
         System.out.println("               ║    10."+Inf.get(9)+"       ║    10."+Inf.get(9)+"        ║");
         System.out.println("               ║    11."+Inf.get(10)+"   ║    11."+Inf.get(10)+"    ║");
         System.out.println("               ║    12."+Inf.get(11)+"    ║    12."+Inf.get(11)+"     ║");
         System.out.println("               ║    13."+Inf.get(12)+"         ║    13."+Inf.get(12)+"          ║");
         System.out.println("               ║    14."+Inf.get(13)+"         ║    14."+Inf.get(13)+"          ║");
         System.out.println("               ║    15."+Inf.get(14)+"      ║    15."+Inf.get(14)+"       ║");
         System.out.println("               ╚═══════════════════════════════════════════════════════╩════════════════════════════════════════════════════════╝"); 
         System.out.println("\n     ENTER 0 TO RETURN TO DASHBOARD");
         des.equal();
    }
    public void cabo() throws Exception
    {
        String cp;
        String cd;
        String cn;
        long cm;
        int cf;
        des.equal();
        System.out.println();
        scan.nextLine();
        System.out.print("Enter Pickup Point: ");
        cp = scan.nextLine();
        System.out.print("Enter Drop Point: ");
        cd = scan.nextLine();
        System.out.print("Enter your name: ");
        cn = scan.nextLine();
        while (true) 
        {
            System.out.print("Mob no: ");
            if(scan.hasNextLong())
            {
                cm = scan.nextLong();
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER NUMBER IN DIGITS");
                scan.next();
            }
        }
        cf = (int)(Math.random()*400 + 60);
        System.out.println("Fair: "+cf);
        des.equal();
        System.out.println();
        System.out.println("                                          ╔═══════════════╗               ╔════════════════╗              ");
        System.out.println("                                          ║   1.Confirm   ║               ║    2.Cancel    ║              ");
        System.out.println("                                          ╚═══════════════╝               ╚════════════════╝              ");
        des.equal();
        int x;
        while(true)
        {
            System.out.print("          Select Option: ");
            if(scan.hasNextInt())
            {
                x = scan.nextInt();
                if(x!=1 && x!=2)
                    {
                        System.out.println("                           YOU SELECTED WRONG NUMBER");
                        cab();
                    }    
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
        switch(x)
        {
            case 1:
                FileOutputStream fos = new FileOutputStream("data/cab.dat",true);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeUTF(cn);
                dos.writeLong(cm);
                dos.writeUTF(cp);
                dos.writeUTF(cd);
                dos.writeUTF(date.toString());
                dos.writeUTF(time.toString());
                dos.writeInt(cf);
                fos.close();
                des.equal();
                System.out.println("                                                            CAB BOOKED SUCCESSFULLY");
                des.equal();
                opt();
                break;
            case 2:
                cab();
                break;
            default:
                System.out.println("                           YOU ENTERED A INVALID NO!!!");
                cab();
                break;
        } 
    }
    public void buso(int icop) throws Exception
    {
        int bp;
        int bd;
        int bt;
        while(true)
        {
            System.out.print("Enter Pick Up Station: ");
            if(scan.hasNextInt())
            {
                bp = scan.nextInt();
                if(bp==0)
                    {
                        opt();
                    } 
                else if(bp>=1 && bp<=10)
                    {
                        while(true)
                            {
                                System.out.print("Enter Drop Station: ");
                                if(scan.hasNextInt())
                                    {
                                         bd = scan.nextInt(); 
                                         if(bd>=1 && bd<=10)
                                            {
                                                if(bd==bp)
                                                {
                                                    des.equal();
                                                    System.out.println("\n");
                                                    des.equal();
                                                    System.out.println("                                                   PICKUP AND DESTINATION CAN'T BE SAME");
                                                    des.equal();
                                                    System.out.println("\n");
                                                }
                                                else
                                                {
                                                    des.dash();
                                                    tim();
                                                    while(true)
                                                    {
                                                        System.out.print("          Select Time: ");
                                                        if(scan.hasNextInt())
                                                        {
                                                            bt = scan.nextInt();
                                                            if(bt>=1 && bt<=12)
                                                            {
                                                                buss(icop, bp, bd, bt);
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                des.equal();
                                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                                des.equal();
                                                                icity();
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                                            scan.next();
                                                        }
                                                        
                                                    }
                                                    
                                                }
                                            }
                                            else
                                            {
                                                des.equal();
                                                System.out.println("\n");
                                                des.equal();
                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                des.equal();
                                                System.out.println("\n");
                                            }  
                                        break; 
                                    }
                                else
                                    {
                                        System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                        scan.next();
                                    }
                            }
                    }
                    else
                    {
                        des.equal();
                        System.out.println("\n");
                        des.equal();
                        System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                        des.equal();
                        System.out.println("\n");
                    } 
                  
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
    } 
    public void buss(int icop,int bp,int bd,int bt) throws Exception
    {
        String bup;
        String bud;
        String but;
        but  = tim.get(bt-1);
        String bn; //name
        int bpa =1;  //no. of passenger
        long bm;    //mob no
        String be;  //email
        int ba;   //age
        int buid;
        int bf = (int)(Math.random()*1000 + 200);
        boolean zs =true;
        switch(icop)
        {
            case 1:
                bup = Gj.get(bp-1);
                bud = Gj.get(bd-1);
                break;
            case 2:
                bup = Rj.get(bp-1);
                bud = Rj.get(bd-1);
                break;
            case 3:
                bup = MH.get(bp-1);
                bud = MH.get(bd-1);
                break;
            case 4:
                bup = KA.get(bp-1);
                bud = KA.get(bd-1);
                break;
            case 5: 
                bup = Up.get(bp-1);
                bud = Up.get(bd-1);
                break;
            case 6:
                bup = MP.get(bp-1);
                bud = MP.get(bd-1);
                break;
            case 7:
                bup = PB.get(bp-1);
                bud = PB.get(bd-1);
                break;
            case 8:
                bup = Ch.get(bp-1);
                bud = Ch.get(bd-1);
                break;
            case 9:
                bup = TN.get(bp-1);
                bud = TN.get(bd-1);
                break;
            case 10:
                bup = Wb.get(bp-1);
                bud = Wb.get(bd-1);
                break;
            default:
                bup = Gj.get(bp-1);
                bud = Gj.get(bd-1);
                break;
        } 
        while(zs)
            {
                System.out.print("Enter number of tickets: ");
                bpa = scan.nextInt();
                if(bpa>=1 && bpa<=5)
                {
                    zs = false;
                }
                else
                {
                    des.equal();
                    System.out.println("                                                      MAXIMUM YOU CAN BOOK 5 TICKETS AT ONCE");
                    des.equal();
                }
            }
            scan.nextLine();
            System.out.print("Enter name: ");
            bn = scan.nextLine();
            while (true) 
            {
                System.out.print("Mob no: ");
                if(scan.hasNextLong())
                {
                    bm = scan.nextLong();
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER NUMBER IN DIGITS");
                    scan.next();
                }
            }
            scan.nextLine();
            System.out.print("Enter E-mail: ");
            be = scan.nextLine();
            while(true)
            {
                System.out.print("Enter Age: ");
                if(scan.hasNextInt())
                {
                    ba = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            System.out.println("Fair: "+bf);
            des.equal();
            System.out.println();
            System.out.println("                                          ╔═══════════════╗               ╔════════════════╗              ");
            System.out.println("                                          ║   1.Confirm   ║               ║    2.Cancel    ║              ");
            System.out.println("                                          ╚═══════════════╝               ╚════════════════╝              ");
            des.equal();
            int x;
            while(true)
            {
                System.out.print("          Select Option: ");
                if(scan.hasNextInt())
                {
                    x = scan.nextInt();
                    if(x!=1 && x!=2)
                        {
                            System.out.println("                           YOU SELECTED WRONG NUMBER");
                            icity();
                        }    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            switch(x)
            {
                case 1:
                    try 
                    {
                        FileInputStream fis = new FileInputStream("data/lastid.dat" );
                        DataInputStream dis = new DataInputStream(fis);
                        buid = dis.readInt();
                        fis.close(); 
                    } 
                    catch (Exception e) 
                    {
                        buid=0;
                    }
                    buid++;
                    FileOutputStream fos = new FileOutputStream("data/lastid.dat");
                    DataOutputStream dos = new DataOutputStream(fos);
                    try 
                    {
                        dos.writeInt(buid);    
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    fos.close();
                    FileOutputStream fos2 = new FileOutputStream("data/busic.dat",true);
                    DataOutputStream dos2 = new DataOutputStream(fos2);
                    dos2.writeInt(buid);
                    dos2.writeUTF(bn);
                    dos2.writeInt(bpa);
                    dos2.writeUTF(bup);
                    dos2.writeUTF(bud);
                    dos2.writeUTF(but);
                    dos2.writeLong(bm);
                    dos2.writeUTF(be);
                    dos2.writeInt(ba);
                    dos2.writeUTF(date.toString());
                    dos2.writeUTF(time.toString());
                    dos2.writeInt(bf);
                    fos2.close();
                    des.equal();
                    System.out.println("                                                            TICKET BOOKED SUCCESSFULLY");
                    System.out.println("                                                               Ticket Id: "+buid);
                    des.equal();
                    System.out.println("\n");
                    opt();
                    break;
                case 2:
                    icity();
                    break;
                default:
                    System.out.println("                           YOU ENTERED A INVALID NO!!!");
                    bus();
                    break;
            }
    } 
    public void busst() throws Exception
    {
        int bsp;
        int bsd;
        int bst;
        while(true)
        {
            System.out.print("Enter Pick Up Station: ");
            if(scan.hasNextInt())
            {
                bsp = scan.nextInt();
                if(bsp==0)
                    {
                        opt();
                    } 
                else if(bsp>=1 && bsp<=15)
                    {
                        while(true)
                            {
                                System.out.print("Enter Drop Station: ");
                                if(scan.hasNextInt())
                                    {
                                         bsd = scan.nextInt(); 
                                         if(bsd>=1 && bsd<=15)
                                            {
                                                if(bsd==bsp)
                                                {
                                                    des.equal();
                                                    System.out.println("\n");
                                                    des.equal();
                                                    System.out.println("                                                   PICKUP AND DESTINATION CAN'T BE SAME");
                                                    des.equal();
                                                    System.out.println("\n");
                                                }
                                                else
                                                {
                                                    des.dash();
                                                    tim();
                                                    while(true)
                                                    {
                                                        System.out.print("          Select Time: ");
                                                        if(scan.hasNextInt())
                                                        {
                                                            bst = scan.nextInt();
                                                            if(bst>=1 && bst<=12)
                                                            {
                                                                bussto(bsp, bsd, bst);
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                des.equal();
                                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                                des.equal();
                                                                istate();
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                                            scan.next();
                                                        }
                                                        
                                                    }
                                                    
                                                }
                                            }
                                            else
                                            {
                                                des.equal();
                                                System.out.println("\n");
                                                des.equal();
                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                des.equal();
                                                System.out.println("\n");
                                            }  
                                        break; 
                                    }
                                else
                                    {
                                        System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                        scan.next();
                                    }
                            }
                    }
                    else
                    {
                        des.equal();
                        System.out.println("\n");
                        des.equal();
                        System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                        des.equal();
                        System.out.println("\n");
                    } 
                  
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
    }
    public void bussto(int bsp,int bsd,int bst) throws Exception
    {
        String bup;
        String bud;
        String but;
        but = tim.get(bst-1);
        bup = Is.get(bsp-1);
        bud = Is.get(bsd-1);
        String bn; //name
        int bpa =1;  //no. of passenger
        long bm;    //mob no
        String be;  //email
        int ba;   //age
        int buid;
        int bf = (int)(Math.random()*1500 + 500);
        boolean zs =true;
        while(zs)
            {
                System.out.print("Enter number of tickets: ");
                bpa = scan.nextInt();
                if(bpa>=1 && bpa<=5)
                {
                    zs = false;
                }
                else
                {
                    des.equal();
                    System.out.println("                                                      MAXIMUM YOU CAN BOOK 5 TICKETS AT ONCE");
                    des.equal();
                }
            }
            scan.nextLine();
            System.out.print("Enter name: ");
            bn = scan.nextLine();
            while (true) 
            {
                System.out.print("Mob no: ");
                if(scan.hasNextLong())
                {
                    bm = scan.nextLong();
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER NUMBER IN DIGITS");
                    scan.next();
                }
            }
            scan.nextLine();
            System.out.print("Enter E-mail: ");
            be = scan.nextLine();
            while(true)
            {
                System.out.print("Enter Age: ");
                if(scan.hasNextInt())
                {
                    ba = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            System.out.println("Fair: "+bf);
            des.equal();
            System.out.println();
            System.out.println("                                          ╔═══════════════╗               ╔════════════════╗              ");
            System.out.println("                                          ║   1.Confirm   ║               ║    2.Cancel    ║              ");
            System.out.println("                                          ╚═══════════════╝               ╚════════════════╝              ");
            des.equal();
            int x;
            while(true)
            {
                System.out.print("          Select Option: ");
                if(scan.hasNextInt())
                {
                    x = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            switch(x)
            {
                case 1:
                    try 
                    {
                        FileInputStream fis = new FileInputStream("data/lastids.dat" );
                        DataInputStream dis = new DataInputStream(fis);
                        buid = dis.readInt();
                        fis.close(); 
                    } 
                    catch (Exception e) 
                    {
                        buid=0;
                    }
                    buid++;
                    FileOutputStream fos = new FileOutputStream("data/lastids.dat");
                    DataOutputStream dos = new DataOutputStream(fos);
                    try 
                    {
                        dos.writeInt(buid);    
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    fos.close();
                    FileOutputStream fos2 = new FileOutputStream("data/busis.dat",true);
                    DataOutputStream dos2 = new DataOutputStream(fos2);
                    dos2.writeInt(buid);
                    dos2.writeUTF(bn);
                    dos2.writeInt(bpa);
                    dos2.writeUTF(bup);
                    dos2.writeUTF(bud);
                    dos2.writeUTF(but);
                    dos2.writeLong(bm);
                    dos2.writeUTF(be);
                    dos2.writeInt(ba);
                    dos2.writeUTF(date.toString());
                    dos2.writeUTF(time.toString());
                    dos2.writeInt(bf);
                    fos2.close();
                    des.equal();
                    System.out.println("                                                            TICKET BOOKED SUCCESSFULLY");
                    System.out.println("                                                               Ticket Id: "+buid);
                    des.equal();
                    System.out.println("\n");
                    opt();
                    break;
                case 2:
                    istate();
                    break;
                default:
                    System.out.println("                           YOU ENTERED A INVALID NO!!!");
                    istate();
                    break;
            }      
    }
    public void trainn() throws Exception
    {
        int tsp;
        int tsd;
        int tst;
        while(true)
        {
            System.out.print("Enter Pick Up Station: ");
            if(scan.hasNextInt())
            {
                tsp = scan.nextInt();
                if(tsp==0)
                    {
                        opt();
                    } 
                else if(tsp>=1 && tsp<=20)
                    {
                        while(true)
                            {
                                System.out.print("Enter Drop Station: ");
                                if(scan.hasNextInt())
                                    {
                                         tsd = scan.nextInt(); 
                                         if(tsd>=1 && tsd<=20)
                                            {
                                                if(tsd==tsp)
                                                {
                                                    des.equal();
                                                    System.out.println("\n");
                                                    des.equal();
                                                    System.out.println("                                                   PICKUP AND DESTINATION CAN'T BE SAME");
                                                    des.equal();
                                                    System.out.println("\n");
                                                }
                                                else
                                                {
                                                    des.dash();
                                                    tim();
                                                    while(true)
                                                    {
                                                        System.out.print("          Select Time: ");
                                                        if(scan.hasNextInt())
                                                        {
                                                            tst = scan.nextInt();
                                                            if(tst>=1 && tst<=12)
                                                            {
                                                                trainno(tsp, tsd, tst);
                                                                break;
                                                            }
                                                            else
                                                            {
                                                                des.equal();
                                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                                des.equal();
                                                                traint();
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                                            scan.next();
                                                        }
                                                        
                                                    }
                                                    
                                                }
                                            }
                                            else
                                            {
                                                des.equal();
                                                System.out.println("\n");
                                                des.equal();
                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                des.equal();
                                                System.out.println("\n");
                                            }  
                                        break; 
                                    }
                                else
                                    {
                                        System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                        scan.next();
                                    }
                            }
                    }
                    else
                    {
                        des.equal();
                        System.out.println("\n");
                        des.equal();
                        System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                        des.equal();
                        System.out.println("\n");
                    }   
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
    }
    public void trainno(int tsp,int tsd,int tst) throws Exception
    {
        String trp;
        String trd;
        String trt;
        trt = tim.get(tst-1);
        trp = Train.get(tsp-1);
        trd = Train.get(tsd-1);
        String tn; //name
        int tpa =1;  //no. of passenger
        long tm;    //mob no
        String te;  //email
        int ta;   //age
        long tad; //aadhar 
        int tid;
        int tf = (int)(Math.random()*2000 + 500);
        boolean zs =true;
        while(zs)
            {
                System.out.print("Enter number of tickets: ");
                tpa = scan.nextInt();
                if(tpa>=1 && tpa<=5)
                {
                    zs = false;
                }
                else
                {
                    des.equal();
                    System.out.println("                                                      MAXIMUM YOU CAN BOOK 5 TICKETS AT ONCE");
                    des.equal();
                }
            }
        scan.nextLine();
        System.out.print("Enter name: ");
        tn = scan.nextLine();
        while (true) 
        {
            System.out.print("Mob no: ");
            if(scan.hasNextLong())
            {
                tm = scan.nextLong();
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER NUMBER IN DIGITS");
                scan.next();
            }
        }
        scan.nextLine();
        while (true) 
        {
            System.out.print("Enter Aadar no: ");
            if(scan.hasNextLong())
            {
                tad = scan.nextLong();
                break;
            }
            else
            {
                System.out.println("                           PLEASE ENTER AADHAR NUMBER IN DIGITS");
                scan.next();
            }
        }
        scan.nextLine();
        System.out.print("Enter E-mail: ");
        te = scan.nextLine();
        while(true)
            {
                System.out.print("Enter Age: ");
                if(scan.hasNextInt())
                {
                    ta = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            System.out.println("Fair: "+tf);
            des.equal();
            System.out.println();
            System.out.println("                                          ╔═══════════════╗               ╔════════════════╗              ");
            System.out.println("                                          ║   1.Confirm   ║               ║    2.Cancel    ║              ");
            System.out.println("                                          ╚═══════════════╝               ╚════════════════╝              ");
            des.equal();
            int x;
            while(true)
            {
                System.out.print("          Select Option: ");
                if(scan.hasNextInt())
                {
                    x = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            switch(x)
            {
                case 1:
                    try 
                    {
                        FileInputStream fis = new FileInputStream("data/trainids.dat" );
                        DataInputStream dis = new DataInputStream(fis);
                        tid = dis.readInt();
                        fis.close(); 
                    } 
                    catch (Exception e) 
                    {
                        tid=0;
                    }
                    tid++;
                    FileOutputStream fos = new FileOutputStream("data/trainids.dat");
                    DataOutputStream dos = new DataOutputStream(fos);
                    try 
                    {
                        dos.writeInt(tid);    
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    fos.close();
                    FileOutputStream fos2 = new FileOutputStream("data/train.dat",true);
                    DataOutputStream dos2 = new DataOutputStream(fos2);
                    dos2.writeInt(tid);
                    dos2.writeUTF(tn);
                    dos2.writeInt(tpa);
                    dos2.writeUTF(trp);
                    dos2.writeUTF(trd);
                    dos2.writeUTF(trt);
                    dos2.writeLong(tm);
                    dos2.writeLong(tad);
                    dos2.writeUTF(te);
                    dos2.writeInt(ta);
                    dos2.writeUTF(date.toString());
                    dos2.writeUTF(time.toString());
                    dos2.writeInt(tf);
                    fos2.close();
                    des.equal();
                    System.out.println("                                                            TICKET BOOKED SUCCESSFULLY");
                    System.out.println("                                                               Ticket Id: "+tid);
                    des.equal();
                    System.out.println("\n");
                    opt();
                    break;
                case 2:
                    traint();
                    break;
                default:
                    System.out.println("                           YOU ENTERED A INVALID NO!!!");
                    traint();
                    break;
            }
    }
    public void flid(int fop) throws Exception
    {
        int foop = fop;
        int fdp;
        int fdd;
        int fdt;
        while(true)
        {
            System.out.print("Enter Pick Up Station: ");
            if(scan.hasNextInt())
            {
                fdp = scan.nextInt();
                if(fdp==0)
                    {
                        opt();
                    } 
                else if(fdp>=1 && fdp<=15)
                    {
                        while(true)
                            {
                                System.out.print("Enter Drop Station: ");
                                if(scan.hasNextInt())
                                    {
                                         fdd = scan.nextInt(); 
                                         if(fdd>=1 && fdd<=15)
                                            {
                                                if(fdd==fdp)
                                                {
                                                    des.equal();
                                                    System.out.println("\n");
                                                    des.equal();
                                                    System.out.println("                                                   PICKUP AND DESTINATION CAN'T BE SAME");
                                                    des.equal();
                                                    System.out.println("\n");
                                                }
                                                else
                                                {
                                                    des.dash();
                                                    tim();
                                                    while(true)
                                                    {
                                                        System.out.print("          Select Time: ");
                                                        if(scan.hasNextInt())
                                                        {
                                                            fdt = scan.nextInt();
                                                            if(fdt>=1 && fdt<=12)
                                                            {
                                                               switch(fop)
                                                               {
                                                                    case 1:
                                                                        flidb(fdp, fdd, fdt);
                                                                        break;
                                                                    case 2:
                                                                        fliib(fdp, fdd, fdt);
                                                                        break;
                                                               }                                                          
                                                            }
                                                            else
                                                            {
                                                                des.equal();
                                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                                des.equal();
                                                                flid(fop);
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                                            scan.next();
                                                        }
                                                        
                                                    }
                                                    
                                                }
                                            }
                                            else
                                            {
                                                des.equal();
                                                System.out.println("\n");
                                                des.equal();
                                                System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                                                des.equal();
                                                System.out.println("\n");
                                            }  
                                        break; 
                                    }
                                else
                                    {
                                        System.out.println("                           PLEASE ENTER A DIGIT!!!");
                                        scan.next();
                                    }
                            }
                    }
                    else
                    {
                        des.equal();
                        System.out.println("\n");
                        des.equal();
                        System.out.println("                                                         YOU SELECTED WRONG NUMBER");
                        des.equal();
                        System.out.println("\n");
                    } 
                  
            }
            else
            {
                System.out.println("                           PLEASE ENTER A DIGIT!!!");
                scan.next();
            }
        }
    }
    public void flidb(int fdp,int fdd,int fdt) throws Exception
    {
        String fsp;
        String fsd;
        String fst;
        String fn; //name
        int fda =1;  //no. of passenger
        long fdm;    //mob no
        String fse;  //email
        int fsa;   //age
        fsp = Df.get(fdp-1);
        fsd = Df.get(fdd-1);
        fst  = tim.get(fdt-1);
        int fdid;
        int fdf = (int)(Math.random()*10000 + 3000);
        boolean zs = true;
        while(zs)
            {
                System.out.print("Enter number of tickets: ");
                fda = scan.nextInt();
                if(fda>=1 && fda<=3)
                {
                    zs = false;
                }
                else
                {
                    des.equal();
                    System.out.println("                                                      MAXIMUM YOU CAN BOOK 3 TICKETS AT ONCE");
                    des.equal();
                }
            }
            scan.nextLine();
            System.out.print("Enter name: ");
            fn = scan.nextLine();
            while (true) 
            {
                System.out.print("Mob no: ");
                if(scan.hasNextLong())
                {
                    fdm = scan.nextLong();
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER NUMBER IN DIGITS");
                    scan.next();
                }
            }
            scan.nextLine();
            System.out.print("Enter E-mail: ");
            fse = scan.nextLine();
            while(true)
            {
                System.out.print("Enter Age: ");
                if(scan.hasNextInt())
                {
                    fsa = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            System.out.println("Fair: "+fdf);
            des.equal();
            System.out.println();
            System.out.println("                                          ╔═══════════════╗               ╔════════════════╗              ");
            System.out.println("                                          ║   1.Confirm   ║               ║    2.Cancel    ║              ");
            System.out.println("                                          ╚═══════════════╝               ╚════════════════╝              ");
            des.equal();
            int x;
            while(true)
            {
                System.out.print("          Select Option: ");
                if(scan.hasNextInt())
                {
                    x = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            switch(x)
            {
                case 1:
                    try 
                    {
                        FileInputStream fis = new FileInputStream("data/flightdid.dat" );
                        DataInputStream dis = new DataInputStream(fis);
                        fdid = dis.readInt();
                        fis.close(); 
                    } 
                    catch (Exception e) 
                    {
                        fdid=0;
                    }
                    fdid++;
                    FileOutputStream fos = new FileOutputStream("data/flightdid.dat");
                    DataOutputStream dos = new DataOutputStream(fos);
                    try 
                    {
                        dos.writeInt(fdid);    
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    fos.close();
                    FileOutputStream fos2 = new FileOutputStream("data/flightd.dat",true);
                    DataOutputStream dos2 = new DataOutputStream(fos2);
                    dos2.writeInt(fdid);
                    dos2.writeUTF(fn);
                    dos2.writeInt(fda);
                    dos2.writeUTF(fsp);
                    dos2.writeUTF(fsd);
                    dos2.writeUTF(fst);
                    dos2.writeLong(fdm);
                    dos2.writeUTF(fse);
                    dos2.writeInt(fsa);
                    dos2.writeUTF(date.toString());
                    dos2.writeUTF(time.toString());
                    dos2.writeInt(fdf);
                    fos2.close();
                    des.equal();
                    System.out.println("                                                            TICKET BOOKED SUCCESSFULLY");
                    System.out.println("                                                               Ticket Id: "+fdid);
                    des.equal();
                    System.out.println("\n");
                    opt();
                    break;
                case 2:
                    domestic();
                    break;
                default:
                    System.out.println("                           YOU ENTERED A INVALID NO!!!");
                    domestic();
                    break;
                    
            }
    }
    
        
    public void fliib(int fdp,int fdd,int fdt) throws Exception
    {
        String ifsp;
        String ifsd;
        String ifst;
        ifsp = Inf.get(fdp-1);
        ifsd = Inf.get(fdd-1);
        ifst = tim.get(fdt-1);
        String ifn; //name
        long ifno; //number
        String ife;//email
        String ifp;//passport number
        String ifv;//visa number
        int ifa;//Age
        String ifnt;//nationality
        int ifnot = 1;//no. of ticket
        int ifid;//id
        int ifdf = (int)(Math.random()*30000 + 12000);
        boolean zs = true;
        while(zs)
            {
                System.out.print("Enter number of tickets: ");
                ifnot = scan.nextInt();
                if(ifnot>=1 && ifnot<=3)
                {
                    zs = false;
                }
                else
                {
                    des.equal();
                    System.out.println("                                                      MAXIMUM YOU CAN BOOK 3 TICKETS AT ONCE");
                    des.equal();
                }
            }
            scan.nextLine();
            System.out.print("Enter name: ");
            ifn = scan.nextLine();
            while (true) 
            {
                System.out.print("Mob no: ");
                if(scan.hasNextLong())
                {
                    ifno = scan.nextLong();
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER NUMBER IN DIGITS");
                    scan.next();
                }
            }
            scan.nextLine();
            System.out.print("Enter E-mail: ");
            ife = scan.nextLine();
             while(true)
            {
                System.out.print("Enter Age: ");
                if(scan.hasNextInt())
                {
                    ifa = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            scan.nextLine();
            System.out.print("Enter passport number: ");
            ifp = scan.nextLine(); 
            System.out.print("Enter visa number: ");
            ifv = scan.nextLine();
            System.out.print("Enter nationality: ");
            ifnt = scan.nextLine();
            System.out.println("Fair: "+ifdf);
            des.equal();
            System.out.println();
            System.out.println("                                          ╔═══════════════╗               ╔════════════════╗              ");
            System.out.println("                                          ║   1.Confirm   ║               ║    2.Cancel    ║              ");
            System.out.println("                                          ╚═══════════════╝               ╚════════════════╝              ");
            des.equal();
            int x;
            while(true)
            {
                System.out.print("          Select Option: ");
                if(scan.hasNextInt())
                {
                    x = scan.nextInt();    
                    break;
                }
                else
                {
                    System.out.println("                           PLEASE ENTER A DIGIT!!!");
                    scan.next();
                }
            }
            switch(x)
            {
                case 1:
                    try 
                    {
                        FileInputStream fis = new FileInputStream("data/flightiid.dat" );
                        DataInputStream dis = new DataInputStream(fis);
                        ifid = dis.readInt();
                        fis.close(); 
                    } 
                    catch (Exception e) 
                    {
                        ifid=0;
                    }
                    ifid++;
                    FileOutputStream fos = new FileOutputStream("data/flightiid.dat");
                    DataOutputStream dos = new DataOutputStream(fos);
                    try 
                    {
                        dos.writeInt(ifid);    
                    } 
                    catch (Exception e) 
                    {
                        e.printStackTrace();
                    }
                    fos.close();
                    FileOutputStream fos2 = new FileOutputStream("data/flighti.dat",true);
                    DataOutputStream dos2 = new DataOutputStream(fos2);
                    dos2.writeInt(ifid);
                    dos2.writeUTF(ifn);
                    dos2.writeInt(ifnot);
                    dos2.writeUTF(ifsp);
                    dos2.writeUTF(ifsd);
                    dos2.writeUTF(ifst);
                    dos2.writeLong(ifno);
                    dos2.writeUTF(ife);
                    dos2.writeInt(ifa);
                    dos2.writeUTF(ifnt);
                    dos2.writeUTF(ifp);
                    dos2.writeUTF(ifv);
                    dos2.writeUTF(date.toString());
                    dos2.writeUTF(time.toString());
                    dos2.writeInt(ifdf);
                    fos2.close();
                    des.equal();
                    System.out.println("                                                            TICKET BOOKED SUCCESSFULLY");
                    System.out.println("                                                               Ticket Id: "+ifid);
                    des.equal();
                    System.out.println("\n");
                    opt();
                    break;
                case 2:
                    international();
                    break;
                default:
                    System.out.println("                           YOU ENTERED A INVALID NO!!!");
                    international();
                    break;
            }
    }
    public static void main(String[] args) throws Exception{
        booking ma = new booking();
        designs des = new designs();
        des.wel();
        System.out.println("\n");
        ma.opt();
    }
}
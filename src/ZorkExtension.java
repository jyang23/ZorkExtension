import java.util.Scanner;
import java.util.Random;

public class ZorkExtension {


    public static String foyer(String room, Scanner input,String move,int money)
    {
        System.out.println("You are currently in the foyer");
        System.out.println("There is a dead scorpion in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"N\"(north) or \"EX\"(exit)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("n"))
            {
                room = "Front Room";
                break;
            }
            else if(move.equals("ex"))
            {
                room = "Exit";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }


    public static String front_room(String room, Scanner input,String move,int money)
    {
        System.out.println("You are currently in the front room");
        System.out.println("There is a piano in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"W\"(west),\"S\"(south),or\"E\"(east)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Library";
                break;
            }
            else if(move.equals("s"))
            {
                room = "Foyer";
                break;
            }
            else if(move.equals("e"))
            {
                room = "Kitchen";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String library(String room, Scanner input,String move,int money)
    {
        System.out.println("You are currently in the library");
        System.out.println("There are spiders in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"N\"(north) or \"E\"(east)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("n"))
            {
                room = "Dining Room";
                break;
            }
            else if(move.equals("e"))
            {
                room = "Front Room";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String kitchen(String room, Scanner input,String move,int money)
    {
        System.out.println("You are currently in kitchen");
        System.out.println("There are bats flying in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"N\"(north) or \"W\"(west)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Front Room";
                break;
            }
            else if(move.equals("n"))
            {
                room = "Parlor";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String dining_room(String room, Scanner input,String move,int money)
    {
        System.out.println("You are currently in the dining room");
        System.out.println("It is full of dust in the room and an empty box");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"S\"(south)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("s"))
            {
                room = "Library";
                break;
            }

            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String vault(String room, Scanner input,String move,int r,boolean f,int money)
    {
        System.out.println("You are currently in vault");
        System.out.println("There three walking skeletons in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"E\"(east)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("e"))
            {
                if(r == 1 || f == true)
                {
                    room = "Secret Room";
                    break;
                }
                else
                {
                    room = "Parlor";
                    break;
                }
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }
    public static String vault2(String room, Scanner input,String move,int r,boolean f,int money)
    {
        System.out.println("You are currently in vault");
        System.out.println("There three walking skeletons in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"NE\"(east) to the secret room or \"SE\"(southeast)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("ne"))
            {
                room = "Secret Room";
                break;
            }
            else if(move.equals("se"))
            {
                room = "Parlor";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String parlor(String room, Scanner input,String move,int money)
    {
        System.out.println("You are currently in parlor");
        System.out.println("There is a treasure chest in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"W\"(west) or \"S\"(south)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Vault";
                break;
            }
            else if(move.equals("s"))
            {
                room = "Kitchen";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    public static String secret_room(String room, Scanner input,String move,int money)
    {
        System.out.println("You are currently in the secret room");
        System.out.println("HOLY, there are piles of gold in the room");
        System.out.println("You have looted $"+money+" in cash!");
        System.out.println("Would you like to go \"W\"(west)?");
        move = input.nextLine();
        move = move.toLowerCase();

        while(true)
        {
            if(move.equals("w"))
            {
                room = "Vault";
                break;
            }
            else
            {
                System.out.println("Invalid move, try again");
                move = input.nextLine();
                move = move.toLowerCase();
            }
        }
        return room;
    }

    //generate number 1-4
    public static int secret()
    {
        Random rand = new Random();
        int number = 1 + rand.nextInt(4);
        return number;
    }

    //generate number 0-$1000
    public static int value()
    {
        Random rand = new Random();
        int number = rand.nextInt(1000);
        return number;
    }

    //generate number 1-8
    public static int robber()
    {
        Random rand = new Random();
        int number = 1 + rand.nextInt(8);
        return number;
    }


    public static void main(String[] args) {


        System.out.println("ZORK: Beware of the Haunted Castle");

        Scanner in = new Scanner(System.in);
        String room = "Foyer";
        boolean flag = false;
        boolean found = false;
        boolean ranaway = false;
        String move = "";
        String quit;
        int r;
        int rooms = 0;
        int mymoney = 0;

        int foyer_value = value();
        int frontroom_value = value();
        int library_value = value();
        int kitchen_value = value();
        int diningroom_value = value();
        int vault_value = value();
        int parlor_value = value();
        int secretroom_value = value();

        int robber = robber();




        while(true)
        {
            if(room.equals("Foyer"))
            {
                mymoney = mymoney + foyer_value;
                foyer_value = 0;

                if(robber == 1 && ranaway == false)
                {
                    System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                    System.out.println("You have ZERO DOLLARS");
                    mymoney = 0;
                    ranaway = true;
                }

                room = foyer(room, in, move, mymoney);
                rooms++;
            }
            else if(room.equals("Front Room"))
            {
                mymoney = mymoney + frontroom_value;
                frontroom_value = 0;

                if(robber == 2 && ranaway == false)
                {
                    System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                    System.out.println("You have ZERO DOLLARS");
                    mymoney = 0;
                    ranaway = true;
                }

                room = front_room(room, in, move, mymoney);
                rooms++;
            }
            else if(room.equals("Library"))
            {
                mymoney = mymoney + library_value;
                library_value = 0;

                if(robber == 3 && ranaway == false)
                {
                    System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                    System.out.println("You have ZERO DOLLARS");
                    mymoney = 0;
                    ranaway = true;
                }

                room = library(room, in, move, mymoney);
                rooms++;
            }
            else if(room.equals("Kitchen"))
            {
                mymoney = mymoney + kitchen_value;
                kitchen_value = 0;

                if(robber == 4 && ranaway == false)
                {
                    System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                    System.out.println("You have ZERO DOLLARS");
                    mymoney = 0;
                    ranaway = true;
                }

                room = kitchen(room, in, move, mymoney);
                rooms++;
            }
            else if(room.equals("Dining Room"))
            {
                mymoney = mymoney + diningroom_value;
                diningroom_value = 0;

                if(robber == 5 && ranaway == false)
                {
                    System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                    System.out.println("You have ZERO DOLLARS");
                    mymoney = 0;
                    ranaway = true;
                }

                room = dining_room(room, in, move, mymoney);
                rooms++;
            }
            else if(room.equals("Vault"))
            {
                r = secret();
                if(r == 1)
                {
                    found = true;
                }
                if(found && flag)
                {
                    mymoney = mymoney + vault_value;
                    vault_value = 0;

                    if(robber == 6 && ranaway == false)
                    {
                        System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                        System.out.println("You have ZERO DOLLARS");
                        mymoney = 0;
                        ranaway = true;
                    }

                    room = vault2(room, in, move, r, found, mymoney);
                    rooms++;
                }
                else if(found)
                {
                    mymoney = mymoney + vault_value;
                    vault_value = 0;

                    if(robber == 6 && ranaway == false)
                    {
                        System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                        System.out.println("You have ZERO DOLLARS");
                        mymoney = 0;
                        ranaway = true;
                    }

                    room = vault(room, in, move, r, found, mymoney);
                    flag = true;
                    rooms++;
                }
                else
                {
                    mymoney = mymoney + vault_value;
                    vault_value = 0;

                    if(robber == 6 && ranaway == false)
                    {
                        System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                        System.out.println("You have ZERO DOLLARS");
                        mymoney = 0;
                        ranaway = true;
                    }

                    room = vault(room, in, move, r, found, mymoney);
                    rooms++;
                }
            }
            else if(room.equals("Parlor"))
            {
                mymoney = mymoney + parlor_value;
                parlor_value = 0;

                if(robber == 7 && ranaway == false)
                {
                    System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                    System.out.println("You have ZERO DOLLARS");
                    mymoney = 0;
                    ranaway = true;
                }

                room = parlor(room, in, move, mymoney);
                rooms++;
            }
            else if(room.equals("Secret Room"))
            {
                mymoney = mymoney + secretroom_value;
                secretroom_value = 0;

                if(robber == 8 && ranaway == false)
                {
                    System.out.println("Oh no a Robber! You've been robbed!!! \"Poor\" you!");
                    System.out.println("You have ZERO DOLLARS");
                    mymoney = 0;
                    ranaway = true;
                }

                room = secret_room(room, in, move, mymoney);
                rooms++;
            }
            else
            {
                System.out.println("Would you like to Exit and runaway \"Y\" or \"N\"?");
                quit = in.nextLine();
                quit = quit.toLowerCase();
                if(quit.equals("y"))
                {
                    r = secret();
                    if(r == 4)
                    {
                        System.out.println("You entered "+rooms+" number of rooms!");
                        System.out.println("You are being followed by a ghost! BOO");
                        System.out.println("You made it out with some cash $"+mymoney);
                        break;
                    }
                    else
                    {
                        System.out.println("You entered "+rooms+" number of rooms!");
                        System.out.println("Safe Travels, come back soon!!");
                        System.out.println("You made it out with some cash $"+mymoney);
                        break;
                    }
                }
                else
                {
                    room = "foyer";
                }
            }
        }
    }
}


import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // Ask the user what their Jedi name is
        System.out.println("Entered Star Wars Episode VIII, you have!");
        System.out.print("Input your Jedi name, you must: ");
        Scanner input = new Scanner(System.in);
        String jediName = input.nextLine();
        System.out.println(jediName + "... A lovely name, that is!");;
        
        // Ask the user what color lightsaber they want
        System.out.println("A Jedi, you are; so craft a lightsaber for you, I shall.");
        System.out.println("What color shall it be, hmm? ");
        String lightsaberColor = input.nextLine();
        
        // Ask the user what they want their quip to be
        System.out.println("The final step before your mission, this is.");
        System.out.print("Enter your catch phrase, you must: ");
        String catchphrase = input.nextLine();
        
        // Prompt the user to select a mission
        System.out.println("Ready, you are, young Padawan.");
        System.out.println("Select a mission number, you must: ");
        System.out.println("1. Keep BB8 Safe");
        System.out.println("2. Destroy the Death Star");
        int missionNumber = 0;
        
        // Validate the user input
        do
        {
            while (!input.hasNextInt())
            {
                System.out.print("Silly silly, you are! Select a correct mission number: ");
                input.nextLine();
            }
            missionNumber = input.nextInt();
            if (missionNumber != 1 && missionNumber != 2)
            {
                System.out.print("Silly silly, you are! Select a correct mission number: ");
            }
        } while(missionNumber != 1 && missionNumber != 2);
        
        System.out.println("Chosen mission " + missionNumber + ", you have.");
        
        /*******************************************************************/
        /*******************************************************************/
        /*******************************************************************/
        
        // Declare the Light Side, the allies of the user
        Entity[] lightSide = new Entity[8];
        lightSide[0] = new Jedi(jediName, catchphrase, lightsaberColor);
        lightSide[1] = new Rebel("Rey", "What'd you expect? I'm perfect..");
        lightSide[2] = new Rebel("Finn", "My accuracy is off the charts!");
        lightSide[3] = new Rebel("Han Solo", "I didn't even lift my pinky..");
        lightSide[4] = new Rebel("Chewbacca", "AAARGLURLGURHRWGWGWARAHWGLRWHHHH");
        lightSide[5] = new Rebel("Poe", "Best pilot ever? Seems like best shot ever too.");
        lightSide[6] = new Medical("Maz", 1);
        lightSide[7] = new Astromech("BB8", 1);
        
        // Declare the Dark Side, the enemies of the user
        Entity[] darkSide = new Entity[8];
        darkSide[0] = new SithLord("Kylo Ren", "That's nothing compared to what I can do.", "Red");
        darkSide[1] = new Stormtrooper("Stormtrooper 1", "Surrender, rebel scum!");
        darkSide[2] = new Stormtrooper("Stormtrooper 2", "Give us the droid!");
        darkSide[3] = new Stormtrooper("Stormtrooper 3", "Hail the imperial!");
        darkSide[4] = new Stormtrooper("Stormtrooper 4", "You're no match, rebel scum!");
        darkSide[5] = new Stormtrooper("Stormtrooper 5", "Traitor!!!");
        darkSide[6] = new Computer("Death Star");
        darkSide[7] = new Door("Locked Door");
        
        /*******************************************************************/
        /*******************************************************************/
        /*******************************************************************/
        
        // Commence the battle!!!!
        if (missionNumber == 1)
        {
            // MISSION 1: KEEP BB8 SAFE
            System.out.println("\nYou just found out that BB8 has a map that leads to Luke Skywalker. "
                    + "The First Order seeks the droid!");
            System.out.println("Your job is to defeat the enemies and keep BB8 alive!");
            System.out.println("Once your HP or BB8's HP go to 0, the game is over.");
            System.out.println("");
            
            while (lightSide[0].getHp() != 0 && lightSide[7].getHp() != 0 &&
                     (darkSide[0].getHp() + darkSide[1].getHp() + darkSide[2].getHp() +
                      darkSide[3].getHp() + darkSide[4].getHp() + darkSide[5].getHp() != 0))
            {
                // Display the scoreboard
                System.out.println("REBELS (ALLIES)\t\t\t\tFIRST ORDER (ENEMIES)");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println(lightSide[0].getName() + "\t\t" + lightSide[0].getHp() + "\t\t\t" + darkSide[0].getName() + "\t\t" + darkSide[0].getHp());
                System.out.println(lightSide[1].getName() + "\t\t" + lightSide[1].getHp() + "\t\t\t" + darkSide[1].getName() + "\t\t" + darkSide[1].getHp());
                System.out.println(lightSide[2].getName() + "\t\t" + lightSide[2].getHp() + "\t\t\t" + darkSide[2].getName() + "\t\t" + darkSide[2].getHp());
                System.out.println(lightSide[3].getName() + "\t" + lightSide[3].getHp() + "\t\t\t" + darkSide[3].getName() + "\t\t" + darkSide[3].getHp());
                System.out.println(lightSide[4].getName() + "\t" + lightSide[4].getHp() + "\t\t\t" + darkSide[4].getName() + "\t\t" + darkSide[4].getHp());
                System.out.println(lightSide[5].getName() + "\t\t" + lightSide[5].getHp() + "\t\t\t" + darkSide[5].getName() + "\t\t" + darkSide[5].getHp());
                System.out.println(lightSide[6].getName() + "\t\t" + lightSide[6].getHp());
                System.out.println(lightSide[7].getName() + "\t\t" + lightSide[7].getHp());
                
                // Ask the user what they want to do
                System.out.println("What do you wish to do?");
                System.out.println("1. Attack with your lightsaber");
                System.out.println("2. Attack with the Force");
                System.out.println("3. Have Maz heal someone");
                int choice = input.nextInt();
                // 1. Attack with your lightsaber
                if (choice == 1)
                {
                    System.out.println("Who do you wish to attack with your lightsaber?");
                    System.out.println("1. " + darkSide[0].getName());
                    System.out.println("2. " + darkSide[1].getName());
                    System.out.println("3. " + darkSide[2].getName());
                    System.out.println("4. " + darkSide[3].getName());
                    System.out.println("5. " + darkSide[4].getName());
                    System.out.println("6. " + darkSide[5].getName());
                    int choice2 = 0;
                    
                    // Input validation
                    do
                    {
                        while (!input.hasNextInt())
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                            input.nextLine();
                        }
                        choice2 = input.nextInt();
                        if (choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4 && choice2 != 5 && choice2 != 6)
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                        }
                    } while(choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4 && choice2 != 5 && choice2 != 6);
                    
                    // Do the actual attack
                    lightSide[0].setTask("1");
                    System.out.println(lightSide[0].getName() + " is now attacking! They aim for " + darkSide[choice2-1].getName() + "!");
                    lightSide[0].doTask(darkSide[choice2-1]);
                    
                    // Light Side attacks Dark Side
                    for (int i = 1; i <= (lightSide.length-3); i++)
                    {
                        // If the character attacking is already dead
                        if (lightSide[i].getActive() == false)
                        {
                            System.out.println(lightSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (darkSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            lightSide[i].doTask(darkSide[attackEnemyNum]);
                        }
                    }
                    
                    // Dark Side attacks Light Side
                    for (int i = 0; i <= darkSide.length-3; i++)
                    {
                        // If the character attacking is already dead
                        if (darkSide[i].getActive() == false)
                        {
                            System.out.println(darkSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (lightSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            darkSide[i].doTask(lightSide[attackEnemyNum]);
                        }
                    }
                }
                
                // 2. Attack with the Force
                else if (choice == 2)
                {
                    System.out.println("Who do you wish to attack with the Force?");
                    System.out.println("1. " + darkSide[0].getName());
                    System.out.println("2. " + darkSide[1].getName());
                    System.out.println("3. " + darkSide[2].getName());
                    System.out.println("4. " + darkSide[3].getName());
                    System.out.println("5. " + darkSide[4].getName());
                    System.out.println("6. " + darkSide[5].getName());
                    int choice2 = 0;
                    
                    // Input validation
                    do
                    {
                        while (!input.hasNextInt())
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                            input.nextLine();
                        }
                        choice2 = input.nextInt();
                        if (choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4 && choice2 != 5 && choice2 != 6)
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                        }
                    } while(choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4 && choice2 != 5 && choice2 != 6);
                    
                    // Do the actual attack
                    lightSide[0].setTask("2");
                    Jedi user = (Jedi) lightSide[0];
                    user.useForce(darkSide[choice2-1]);
                    
                    // Light Side attacks Dark Side
                    for (int i = 1; i <= (lightSide.length-3); i++)
                    {
                        // If the character attacking is already dead
                        if (lightSide[i].getActive() == false)
                        {
                            System.out.println(lightSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (darkSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            lightSide[i].doTask(darkSide[attackEnemyNum]);
                        }
                    }
                    
                    // Dark Side attacks Light Side
                    for (int i = 0; i <= darkSide.length-3; i++)
                    {
                        // If the character attacking is already dead
                        if (darkSide[i].getActive() == false)
                        {
                            System.out.println(darkSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (lightSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            darkSide[i].doTask(lightSide[attackEnemyNum]);
                        }
                    }
                }
                
                // 3. Have Maz heal someone
                else if (choice == 3 && lightSide[6].getActive() == true)
                {
                    System.out.println("Who do you wish to heal?");
                    System.out.println("1. " + lightSide[0].getName());
                    System.out.println("2. " + lightSide[1].getName());
                    System.out.println("3. " + lightSide[2].getName());
                    System.out.println("4. " + lightSide[3].getName());
                    System.out.println("5. " + lightSide[4].getName());
                    System.out.println("6. " + lightSide[5].getName());
                    int choice2 = 0;
                    
                    // Input validation
                    do
                    {
                        while (!input.hasNextInt())
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                            input.nextLine();
                        }
                        choice2 = input.nextInt();
                        if (choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4 && choice2 != 5 && choice2 != 6)
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                        }
                    } while(choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4 && choice2 != 5 && choice2 != 6);
                    
                    // If the player is at max HP, they cannot heal for any more.
                    // If not, they may heal.
                    if (choice2 == 1)
                    {
                        if (lightSide[0].getHp() == 100)
                        {
                            System.out.println("This person is at full health. You may not heal for any more.");
                        }
                        else
                        {
                            lightSide[6].doTask(lightSide[0]);
                        }
                    }
                    
                    else if (choice2 == 2 && choice2 == 3 && choice2 == 4 && choice2 == 5 && choice2 == 6)
                    {
                        if (lightSide[(choice2)-1].getHp() == 50)
                        {
                            System.out.println("This person is at full health. You may not heal for any more.");
                        }
                        else
                        {
                            lightSide[6].doTask(lightSide[(choice2)-1]);
                        }
                    }
                    
                    // Light Side attacks Dark Side
                    for (int i = 1; i <= (lightSide.length-3); i++)
                    {
                        // If the character attacking is already dead
                        if (lightSide[i].getActive() == false)
                        {
                            System.out.println(lightSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (darkSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            lightSide[i].doTask(darkSide[attackEnemyNum]);
                        }
                    }
                    
                    // Dark Side attacks Light Side
                    for (int i = 0; i <= darkSide.length-3; i++)
                    {
                        // If the character attacking is already dead
                        if (darkSide[i].getActive() == false)
                        {
                            System.out.println(darkSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (lightSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            darkSide[i].doTask(lightSide[attackEnemyNum]);
                        }
                    }
                    
                }
                
                else if (choice == 3 && lightSide[6].getActive() == false)
                {
                    // Inform the user that they cannot heal
                    System.out.println("The healer is no longer active; you may not heal.");
                    
                    // Light Side attacks Dark Side
                    for (int i = 1; i <= (lightSide.length-3); i++)
                    {
                        // If the character attacking is already dead
                        if (lightSide[i].getActive() == false)
                        {
                            System.out.println(lightSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (darkSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            lightSide[i].doTask(darkSide[attackEnemyNum]);
                        }
                    }
                    
                    // Dark Side attacks Light Side
                    for (int i = 0; i <= darkSide.length-3; i++)
                    {
                        // If the character attacking is already dead
                        if (darkSide[i].getActive() == false)
                        {
                            System.out.println(darkSide[i].getName() + " is at zero hp and cannot attack. ");
                        }
                        else
                        {
                            // Randomize which enemy they attack
                            Random gen = new Random();
                            int attackEnemyNum = gen.nextInt(7);
                            System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                            // If the enemy they are trying to attack is already dead
                            while (lightSide[attackEnemyNum].getActive() == false)
                            {
                                System.out.println("The target already had zero hp. Switching targets...");
                                System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                attackEnemyNum = gen.nextInt(7);
                            }
                            darkSide[i].doTask(lightSide[attackEnemyNum]);
                        }
                    }
                }
                
                // Input validation
                else
                {
                    do
                    {
                        while (!input.hasNextInt())
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                            input.nextInt();
                        }
                        choice = input.nextInt();
                        if (choice != 1 && choice != 2 && choice != 3)
                        {
                            System.out.print("Invalid input. Select a correct target: ");
                        }
                    } while(choice != 1 && choice != 2 && choice != 3);
                }
                
                if (lightSide[0].getHp() == 0 || lightSide[7].getHp() == 0)
                {
                    System.out.println("Failed this mission, you have....");
                }
                else if (darkSide[0].getHp() + darkSide[1].getHp() + darkSide[2].getHp() +
                      darkSide[3].getHp() + darkSide[4].getHp() + darkSide[5].getHp() == 0)
                {
                    System.out.println("A success, this mission was! Congratulations!");
                }
            }
            
            
        }
        
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        /***************************************************************/
        
        else if (missionNumber == 2)
        {
            // MISSION 2: DESTROY THE DEATH STAR
            System.out.println("\nThe First Order is charging up the Death Star and everyone is in danger!");
            System.out.println("Your job is to destroy the Death Star, which you may do so once BB8 destroys the locked door.");
            System.out.println("Once your HP goes to 0, the game is over.");
            System.out.println("");
            
            while (lightSide[0].getHp() != 0 && darkSide[6].getHp() != 0)
            {
                System.out.println("*You are temporarily controlling BB8*");
                System.out.println("The room to the X-wings are locked. Everyone turns to you to unlock it.");
                System.out.println("What would you like BB8 to do?");
                System.out.println("1. Break dance");
                System.out.println("2. Destroy lock on locked door");
                int choice = input.nextInt();
                
                // 1. Break dance
                while (choice == 1)
                {
                    System.out.println("BB8 is break dancing.");
                    System.out.println("The rebels complain that there is no time to dance! We must save the world!");
                    System.out.println("What would you like BB8 to do?");
                    System.out.println("1. Break dance");
                    System.out.println("2. Destroy lock on locked door");
                    choice = input.nextInt();
                }
                
                // 2. Destroy lock on locked door
                if (choice == 2)
                {
                    System.out.println("You chose to destroy the lock on the locked door.");
                    System.out.println("To do so, BB8 must bring the door's hp to zero.");
                    // Ask the user what they would like to do
                    System.out.println("What would you like to BB8 to do?");
                    System.out.println("1. Hack the door's code");
                    int bb8Task = 0;
                        
                        // Input validation
                        do
                        {
                            while (!input.hasNextInt())
                            {
                                System.out.print("Invalid input. Select a correct mission: ");
                                input.nextInt();
                            }
                            bb8Task = input.nextInt();
                            if (bb8Task != 1)
                            {
                                System.out.print("Invalid input. Select a correct mission: ");
                            }
                        } while(bb8Task != 1);
                       
                        // BB8 uses doTask
                        lightSide[7].doTask(darkSide[7]);
                        
                        // Allow the user to continue with the mission
                        System.out.println("The rebels get on their x-wings and are headed for the Death Star.");
                        System.out.println("Remember: The mission is to destroy the Death Star.");
                    while (darkSide[6].getHp() != 0)
                    {
                        
                 
                        
                        System.out.println("REBELS (ALLIES)\t\t\t\tFIRST ORDER (ENEMIES)");
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println(lightSide[0].getName() + "\t\t" + lightSide[0].getHp() + "\t\t\t" + darkSide[6].getName() + "\t\t" + darkSide[6].getHp());
                        System.out.println(lightSide[1].getName() + "\t\t" + lightSide[1].getHp() + "\t\t\t" + darkSide[7].getName() + "\t\t" + darkSide[7].getHp());
                        System.out.println(lightSide[2].getName() + "\t\t" + lightSide[2].getHp() + "\t\t\t" + darkSide[2].getName() + "\t\t" + darkSide[2].getHp());
                        System.out.println(lightSide[3].getName() + "\t" + lightSide[3].getHp() + "\t\t\t" + darkSide[3].getName() + "\t\t" + darkSide[3].getHp());
                        System.out.println(lightSide[4].getName() + "\t" + lightSide[4].getHp() + "\t\t\t" + darkSide[4].getName() + "\t\t" + darkSide[4].getHp());
                        System.out.println(lightSide[5].getName() + "\t\t" + lightSide[5].getHp() + "\t\t\t" + darkSide[5].getName() + "\t\t" + darkSide[5].getHp());
                        System.out.println(lightSide[6].getName() + "\t\t" + lightSide[6].getHp());
                        System.out.println(lightSide[7].getName() + "\t\t" + lightSide[7].getHp());
                        System.out.println("");
                        
                        // Ask the user what they want to do
                        System.out.println("What do you wish to do?");
                        System.out.println("1. Attack with your lightsaber");
                        System.out.println("2. Attack with the Force");
                        System.out.println("3. Have Maz heal someone");
                        int choice2 = 0;
                        
                        // Input validation
                        do
                        {
                            while (!input.hasNextInt())
                            {
                                System.out.print("Invalid input. Select a correct task: ");
                                input.nextLine();
                            }
                            choice2 = input.nextInt();
                            if (choice2 != 1 && choice2 != 2 && choice2 != 3)
                            {
                                System.out.print("Invalid input. Select a correct task: ");
                            }
                        } while(choice2 != 1 && choice2 != 2 && choice2 != 3);
                        
                        // 1. Attack with your lightsaber
                        if (choice2 == 1)
                        {
                            System.out.println("Who do you wish to attack with your lightsaber?");
                            System.out.println("1. " + darkSide[1].getName());
                            System.out.println("2. " + darkSide[2].getName());
                            System.out.println("3. " + darkSide[3].getName());
                            System.out.println("4. " + darkSide[4].getName());
                            System.out.println("5. " + darkSide[5].getName());
                            System.out.println("6. " + darkSide[6].getName());
                            System.out.println("7. " + darkSide[7].getName());
                            int choice3 = 0;
                            // Input validation
                            do
                            {
                                while (!input.hasNextInt())
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                    input.nextLine();
                                }
                                choice3 = input.nextInt();
                                if (choice3 != 1 && choice3 != 2 && choice3 != 3 && choice3 != 4 && choice3 != 5 && choice3 != 6 && choice3 != 7)
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                }
                            } while(choice3 != 1 && choice3 != 2 && choice3 != 3 && choice3 != 4 && choice3 != 5 && choice3 != 6 && choice3 != 7);
                    
                            // Do the actual attack
                            lightSide[0].setTask("1");
                            System.out.println(lightSide[0].getName() + " is now attacking! They aim for " + darkSide[choice3].getName() + "!");
                            lightSide[0].doTask(darkSide[choice3]);
                    
                            // Light Side attacks Dark Side
                            for (int i = 1; i <= (lightSide.length-2); i++)
                            {
                                // If the character attacking is already dead
                                if (lightSide[i].getActive() == false)
                                {
                                    System.out.println(lightSide[i].getName() + " is at zero hp and cannot attack. ");
                                }
                                else
                                {
                                    // Randomize which enemy they attack
                                    Random gen = new Random();
                                    int attackEnemyNum = gen.nextInt(6)+1;
                                    System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                    // If the enemy they are trying to attack is already dead
                                    while (darkSide[attackEnemyNum].getActive() == false)
                                    {
                                        System.out.println("The target already had zero hp. Switching targets...");
                                        System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                        attackEnemyNum = gen.nextInt(6)+1;
                                    }
                                    lightSide[i].doTask(darkSide[attackEnemyNum]);
                                }
                            }
                    
                            // Dark Side attacks Light Side
                            for (int i = 1; i <= darkSide.length-3; i++)
                            {
                                // If the character attacking is already dead
                                if (darkSide[i].getActive() == false)
                                {
                                    System.out.println(darkSide[i].getName() + " is at zero hp and cannot attack. ");
                                }
                                else
                                {
                                    // Randomize which enemy they attack
                                    Random gen = new Random();
                                    int attackEnemyNum = gen.nextInt(8);
                                    System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                    // If the enemy they are trying to attack is already dead
                                    while (lightSide[attackEnemyNum].getActive() == false)
                                    {
                                        System.out.println("The target already had zero hp. Switching targets...");
                                        System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                        attackEnemyNum = gen.nextInt(8);
                                    }
                                    darkSide[i].doTask(lightSide[attackEnemyNum]);
                                }
                            }
                        }
                        
                        // 2. Attack with the Force
                        else if (choice2 == 2)
                        {
                            System.out.println("Who do you wish to attack with the Force?");
                            System.out.println("1. " + darkSide[1].getName());
                            System.out.println("2. " + darkSide[2].getName());
                            System.out.println("3. " + darkSide[3].getName());
                            System.out.println("4. " + darkSide[4].getName());
                            System.out.println("5. " + darkSide[5].getName());
                            System.out.println("6. " + darkSide[6].getName());
                            System.out.println("7. " + darkSide[7].getName());
                            int choice3 = 0;
                    
                            // Input validation
                            do
                            {
                                while (!input.hasNextInt())
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                    input.nextLine();
                                }
                                choice3 = input.nextInt();
                                if (choice3 != 1 && choice3 != 2 && choice3 != 3 && choice3 != 4 && choice3 != 5 && choice3 != 6 && choice3 != 7)
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                }
                            } while(choice3 != 1 && choice3 != 2 && choice3 != 3 && choice3 != 4 && choice3 != 5 && choice3 != 6 && choice3 != 7);
                    
                            // Do the actual attack
                            lightSide[0].setTask("2");
                            lightSide[0].doTask(darkSide[choice3]);
                    
                            // Light Side attacks Dark Side
                            for (int i = 1; i <= (lightSide.length-2); i++)
                            {
                                // If the character attacking is already dead
                                if (lightSide[i].getActive() == false)
                                {
                                    System.out.println(lightSide[i].getName() + " is at zero hp and cannot attack. ");
                                }
                                else
                                {
                                    // Randomize which enemy they attack
                                    Random gen = new Random();
                                    int attackEnemyNum = gen.nextInt(6)+1;
                                    System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                    // If the enemy they are trying to attack is already dead
                                    while (darkSide[attackEnemyNum].getActive() == false)
                                    {
                                        System.out.println("The target already had zero hp. Switching targets...");
                                        System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                        attackEnemyNum = gen.nextInt(6)+1;
                                    }
                                    lightSide[i].doTask(darkSide[attackEnemyNum]);
                                }
                            }
                    
                            // Dark Side attacks Light Side
                            for (int i = 1; i <= darkSide.length-3; i++)
                            {
                                // If the character attacking is already dead
                                if (darkSide[i].getActive() == false)
                                {
                                    System.out.println(darkSide[i].getName() + " is at zero hp and cannot attack. ");
                                }
                                else
                                {
                                    // Randomize which enemy they attack
                                    Random gen = new Random();
                                    int attackEnemyNum = gen.nextInt(8);
                                    System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                    // If the enemy they are trying to attack is already dead
                                    while (lightSide[attackEnemyNum].getActive() == false)
                                    {
                                        System.out.println("The target already had zero hp. Switching targets...");
                                        System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                        attackEnemyNum = gen.nextInt(8);
                                    }
                                    darkSide[i].doTask(lightSide[attackEnemyNum]);
                                }
                            }
                        }
                        
                        // 3. Have Maz heal someone
                        else if (choice == 3)
                        {
                            System.out.println("Who do you wish to heal?");
                            System.out.println("1. " + lightSide[0].getName());
                            System.out.println("2. " + lightSide[1].getName());
                            System.out.println("3. " + lightSide[2].getName());
                            System.out.println("4. " + lightSide[3].getName());
                            System.out.println("5. " + lightSide[4].getName());
                            System.out.println("6. " + lightSide[5].getName());
                            int choice3 = 0;
                    
                            // Input validation
                            do
                            {
                                while (!input.hasNextInt())
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                    input.nextLine();
                                }
                                choice3 = input.nextInt();
                                if (choice3 != 1 && choice3 != 2 && choice3 != 3 && choice3 != 4 && choice3 != 5 && choice3 != 6)
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                }
                            } while(choice3 != 1 && choice3 != 2 && choice3 != 3 && choice3 != 4 && choice3 != 5 && choice3 != 6);
                    
                            // If the player is at max HP, they cannot heal for any more.
                            // If not, they may heal.
                            if (choice3 == 1)
                            {
                                if (lightSide[0].getHp() == 100)
                                {
                                    System.out.println("This person is at full health. You may not heal for any more.");
                                }
                                else
                                {
                                    lightSide[6].doTask(lightSide[0]);
                                }
                            }
                    
                            else if (choice3 == 2 && choice3 == 3 && choice3 == 4 && choice3 == 5 && choice3 == 6)
                            {
                                if (lightSide[(choice3)-1].getHp() == 50)
                                {
                                    System.out.println("This person is at full health. You may not heal for any more.");
                                }
                                else
                                {
                                    lightSide[6].doTask(lightSide[(choice3)-1]);
                                }
                            }
                    
                            // Light Side attacks Dark Side
                            for (int i = 1; i <= (lightSide.length-2); i++)
                            {
                                // If the character attacking is already dead
                                if (lightSide[i].getActive() == false)
                                {
                                    System.out.println(lightSide[i].getName() + " is at zero hp and cannot attack. ");
                                }
                                else
                                {
                                    // Randomize which enemy they attack
                                    Random gen = new Random();
                                    int attackEnemyNum = gen.nextInt(6)+1;
                                    System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                    // If the enemy they are trying to attack is already dead
                                    while (darkSide[attackEnemyNum].getActive() == false)
                                    {
                                        System.out.println("The target already had zero hp. Switching targets...");
                                        System.out.println(lightSide[i].getName() + " is now attacking! They aim for " + darkSide[attackEnemyNum].getName() + "!");
                                        attackEnemyNum = gen.nextInt(6)+1;
                                    }
                                    lightSide[i].doTask(darkSide[attackEnemyNum]);
                                }
                            }
                    
                            // Dark Side attacks Light Side
                            for (int i = 1; i <= darkSide.length-3; i++)
                            {
                                // If the character attacking is already dead
                                if (darkSide[i].getActive() == false)
                                {
                                    System.out.println(darkSide[i].getName() + " is at zero hp and cannot attack. ");
                                }
                                else
                                {
                                    // Randomize which enemy they attack
                                    Random gen = new Random();
                                    int attackEnemyNum = gen.nextInt(8);
                                    System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                    // If the enemy they are trying to attack is already dead
                                    while (lightSide[attackEnemyNum].getActive() == false)
                                    {
                                        System.out.println("The target already had zero hp. Switching targets...");
                                        System.out.println(darkSide[i].getName() + " is now attacking! They aim for " + lightSide[attackEnemyNum].getName() + "!");
                                        attackEnemyNum = gen.nextInt(8);
                                    }
                                    darkSide[i].doTask(lightSide[attackEnemyNum]);
                                }
                            }
                        }
                        
                        // Input validation
                        else
                        {
                            do
                            {
                                while (!input.hasNextInt())
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                    input.nextInt();
                                }
                                choice = input.nextInt();
                                if (choice != 1 && choice != 2 && choice != 3)
                                {
                                    System.out.print("Invalid input. Select a correct target: ");
                                }
                            } while(choice != 1 && choice != 2 && choice != 3);
                        }
                
                        if (lightSide[0].getHp() == 0)
                        {
                            System.out.println("Failed this mission, you have....");
                        }
                        else if (darkSide[6].getHp() == 0)
                        {
                            System.out.println("A success, this mission was! Congratulations!");
                        }
                    }
                }
            }
        }
    }
}

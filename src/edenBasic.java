import java.util.Scanner;


// change strength to courage 
// put in kobjektiv as well
// URGENT: ADD A WHITE BOARD
// it needs to ask for routine stuff
// maybe put prompts into a different class 
// you could initialize the entire variables in an arrayList
// #1 add comments asa
// put if statements lower and the variables higher
// add percentage calculator 
// #2 build quest.java Cla	ss 
// make it pop up in a new window when you run it where it prompts you for all the data 
// daily urgency

public class edenBasic
{

	public static void checkZero(int m){
		if(m > 0){
			//do nothing
		} else {
			m = 0;
		}
	}
	
	/* old level check
	public static void curLvl(int stat, int lvl, int cap){
		if(stat > cap){
			lvl++;
			stat = stat - cap; 
			cap = cap + cap/10;
				curLvl(stat, lvl, cap);
		}
	}*/

	
	public static String divider() {
		return "------";
	}
	
	public static String makeString(String name, int xp ){
		String g = name +":" + "\n" + "current xp: " + xp + "\n" + divider() + "\n";
		return g;
	}
	
	public static String progressString(String progress, String name, int sessions){
		progress = progress + "Today you did " + sessions + " sessions of " + name +". \n";
		return progress;
	}
	
	
	
	public static void main(String[] args){
		
		//@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//give the date 
		System.out.println("What days is eden documenting: ");
		String dateName = input.nextLine();
		
		/* fluid attributes 
		System.out.print("How happy are you (1 to 100) : ");
		int happiness = input.nextInt(); // out of 30
		*/

		String y = "y";
		
		
		String comment = "";
		
		System.out.println("Comments ? ");
		String b1 = input.next();
		input.nextLine();
		
		if(b1.equals(y)){
			String com1 = input.nextLine();
			comment = comment + "comment" + "\n" + com1;
			/*System.out.println("More ? ");
			input.nextLine();
			String b2 = input.next();
			input.nextLine();
			if(b2.equals(y)){
				String com2 = input.nextLine();
				input.nextLine();
				System.out.println("More ? ");
				String b3 = input.next();
				input.nextLine();
				comment = comment + "\n" + com2;
				if(b3.equals(y)){
					String com3 = input.nextLine();
					input.nextLine();
					comment = comment + "\n" + com3;
				} 
			}*/
		}
		
		comment = comment + "\n" + "------" + "\n"; 
		
		/*TIER 1 - 
		 *TIER 2 - 
		 *TIER 3 - Walk, Nap, Housework, Internet Overconsomption, Driving, Editing Photos, Editing Writing */ 
		
	//activities 
	/* core ones 1 to 5  */	int programming=0;	int writing=0; 		int edening=0;		int enterprenuership=0;	int health=0; 
	/*secondary 3,4,5,6,7*/	int reading=0;		int exercize=0;		int running=0;		int meditation=0;		int photography=0;	
							int nina=0;			int social=0;		int family=0; 		int interactions=0; 	int aquintances=0;
	/*easy 8,9,10,11*/		int walking=0;	 	int napping=0; 		int housework=0;	int cooking=0;			int driving=0;
							int editphoto=0;	int editwrite=0;	int consumption=0;	int overconsumption=0;
			
				
			
				//Check what activites have been done that day
				
				System.out.print("Did you program today: ");				String a1 = input.next();
				System.out.print("Did you write today: ");					String a2 = input.next();
				System.out.print("Did you eden today: ");					String a3 = input.next();
				System.out.print("Did you enterprenuer today: ");			String a4 = input.next();
				System.out.print("Did you health today: ");					String a5 = input.next();
				
				System.out.print("Did you read today: ");					String a6 = input.next();
				System.out.print("Did you exercize today: ");				String a7 = input.next();
				System.out.print("Did you run today: ");					String a8 = input.next();
				System.out.print("Did you meditate today: ");				String a9 = input.next();
				System.out.print("Did you photograph today: ");				String a10 = input.next();
				
				System.out.print("Did you spend time with nina today: ");	String a11 = input.next();
				System.out.print("Did you socialize today: ");				String a12 = input.next();
				System.out.print("Did you spend time with family today: ");	String a13 = input.next();
				System.out.print("Did you interact today: ");				String a14 = input.next();
				System.out.print("Did you meet new people today: ");		String a15 = input.next();
				
				System.out.print("Did you walk today: ");					String a16 = input.next();
				System.out.print("Did you nap today: ");					String a17 = input.next();
				System.out.print("Did you housework today: ");				String a18 = input.next();
				System.out.print("Did you cook today: ");					String a19 = input.next();
				System.out.print("Did you drive today: ");					String a20 = input.next();
				
				System.out.print("Did you edit photos today: ");			String a21 = input.next();
				System.out.print("Did you edit text today: ");				String a22 = input.next();
				System.out.print("Did you consume today: ");				String a23 = input.next();
				System.out.print("Did you over consume today: ");			String a24 = input.next();
				
				
				
				/*("program(1), write(2),");
				("read(3),workout(4),housework(5),meditation(6),eden(7),");
				("not much(8), news(9), albums (10), people(11), gardening(12), stumble(13)")*/;
				
				String progress = ""; 
				
				//ask how many sessions of activites that have been performed has been done
				//and add the progress to a String
				
							
			if(a1.equals(y)){										
				System.out.print("How much of programing did you do: ");
				programming		= input.nextInt();
				progress 	= progressString(progress, "programming", programming);}
			if(a2.equals(y)){										
				System.out.print("How much of writing did you do: ");
				writing = input.nextInt();
				progress =  progressString(progress, "writing", writing);}
			if(a3.equals(y)){										
				System.out.print("How much of edening did you do: ");
				edening = input.nextInt();
				progress =  progressString(progress, "edening", edening);}
			if(a4.equals(y)){										
				System.out.print("How much of enterprenuership did you do: ");
				enterprenuership= input.nextInt();
				progress =  progressString(progress, "enterprenuership", enterprenuership);}
			if(a5.equals(y)){										
				System.out.print("How much of health did you do: ");
				health = input.nextInt();
				progress =  progressString(progress, "health", health);}
			
			if(a6.equals(y)){										
				System.out.print("How much of reading did you do: ");
				reading= input.nextInt();
				progress =  progressString(progress,"reading", reading);}
			if(a7.equals(y)){										
				System.out.print("How much of exercize did you do: ");
				exercize= input.nextInt();
				progress =  progressString(progress,"exercize", exercize);}
			if(a8.equals(y)){										
				System.out.print("How much of running did you do: ");
				running = input.nextInt();
				progress =  progressString(progress,"running",running);}
			if(a9.equals(y)){										
				System.out.print("How much of meditation did you do: ");
				meditation= input.nextInt();
				progress =  progressString(progress,"meditation",meditation);}
			if(a10.equals(y)){										
				System.out.print("How much of photography did you do: ");
				photography= input.nextInt();
				progress =  progressString(progress,"photography", photography);}
			
			if(a11.equals(y)){										
				System.out.print("How much of nina did you do: ");
				nina = input.nextInt();
				progress =  progressString(progress,"nina",nina);}
			if(a12.equals(y)){
				System.out.print("How much did you social today: ");
				social= input.nextInt();
				progress= progressString(progress,"social", social);}
			if(a13.equals(y)){
				System.out.print("How much did you family today: ");
				family= input.nextInt();
				progress= progressString(progress,"family", family);}
			if(a14.equals(y)){
				System.out.print("How much did you interactions today: ");
				interactions= input.nextInt();
				progress= progressString(progress,"interactions", interactions);}
			if(a15.equals(y)){
				System.out.print("How much did you aquintances today: ");
				aquintances= input.nextInt();
				progress= progressString(progress,"aquintances", aquintances);}
			
			if(a16.equals(y)){
				System.out.print("How much did you walking today: ");
				walking= input.nextInt();
				progress= progressString(progress,"walking", walking);}
			if(a17.equals(y)){
				System.out.print("How much did you napping today: ");
				napping= input.nextInt();
				progress= progressString(progress,"napping", napping);}
			if(a18.equals(y)){
				System.out.print("How much did you housework today: ");
				housework= input.nextInt();
				progress= progressString(progress,"housework", housework);}
			if(a19.equals(y)){
				System.out.print("How much did you cooking today: ");
				cooking= input.nextInt();
				progress= progressString(progress,"cooking", cooking);}
			if(a20.equals(y)){
				System.out.print("How much did you driving today: ");
				driving= input.nextInt();
				progress= progressString(progress,"driving", driving);}
			
			if(a21.equals(y)){
				System.out.print("How much did you editphoto today: ");
				editphoto= input.nextInt();
				progress= progressString(progress,"editphoto", editphoto);}
			if(a22.equals(y)){
				System.out.print("How much did you editwrite today: ");
				editwrite= input.nextInt();
				progress= progressString(progress,"editwrite", editwrite);}
			if(a23.equals(y)){
				System.out.print("How much did you consumption today: ");
				consumption= input.nextInt();
				progress= progressString(progress,"consumption", consumption);}
			if(a24.equals(y)){
				System.out.print("How much did you overconsumption today: ");
				overconsumption= input.nextInt();
				progress= progressString(progress,"overconsumption", overconsumption);}
			progress = progress + divider() + "\n";
			
		//String hapString = "Happiness: " + happiness + "\n";
		
		
		/*STRENGTH Determination Courage Passion Freedome Stoicism Harshness 
		 * Endurance Honesty Composure 
		 * AGILITY Energy Focus Flexibility 
		 * Instinct Laziness Addictions 
		 * WISDOM Context Love Faith 
		 * Conciousness Philosophy Happiness Empathy 
		 * INTELLECT Ideas 
		 * Creativity Knowledge Specific Knowledge Memmory Programming 
		 * Writing Confucious Enterprenuership Economy Sociology 
		 * ENVIOROMENT Friends charisma Elequency Influence Envioroment Wit Voice Health Gold */
		//Basic construct of a trait
		
		/*	Determination Courage Passion Freedome Stoicism Harshness Endurance Honesty Composure 
		Energy Focus Flexibility Instinct Laziness Addictions  
		Context Love Faith Conciousness Philosophy Happiness Empathy 
		Ideas Creativity General Knowledge Memmory Specific Knowledge Programming Writing Confucious Enterprenuership Economy Sociology 
		Friends charisma Elequency Influence Envioroment Wit Voice and 	HEALTH GOLD */
		// STRENGTH
		int determination = 7323;
		int courage = 9118;
		int passsion = 7118;
		int freedome = 8987;
		int stoicism = 9518;
		int harshness = 8588;
		int endurance = 8125;
		int honesty = 11976; 
		int composure = 8573;
		// AGILITY
		int energy = 5191;
		int focus = 6688;
		int flexibility= 6688;
		int instinct = 7053;
		int laziness= 19750;
		int addictions= 15798;
		
		// WISDOM
		int context= 12575;
		int love= 8556;
		int faith= 10104;
		int conciousness= 14036;
		int philosophy= 14048;
		int happiness= 8252;
		int empathy= 8525;
		// INTELLECT
		int ideas= 10333;
		int creativity= 7991;
		int generalKnowledge= 13697;
		int memmory = 6652;
		int programmingChar= 2145;
		int writingChar= 8663;
		int confucious= 7565;
		int enterprenuershipChar= 7158;
		int economy= 7500;
		int sociology= 12524;
		// ENVIORONMENT
		int friends= 4164;
		int charisma= 7542;
		int elequency= 8593;
		int influence= 7226;
		int environment= 9258;
		int wit= 8796;
		int voice= 6524;
				
		int healthChar= 8219;
		int gold= 608;
		
		
		// STRENGTH CHARACHTERISTICS
		determination = determination 
				+ programming*5	+ writing*3		+ edening*4 	+ enterprenuership*3 	+ health*4
				+ meditation*1	+ exercize*1	+ running*3 	+ reading*1 			+ photography*0
				+ nina*0		+ social*1		+ family*1		+ interactions*0		+ aquintances*0
				+ walking*0		+ napping*0		+ housework*1	+ cooking*0				+ driving*2
				+ editphoto*1	+ editwrite*0	+ consumption*0	+ overconsumption*(-3);
		String determinationString = makeString("determination", determination);
		
		courage = courage 
				+ programming*2	+ writing*2		+ edening*3 	+ enterprenuership*5 	+ health*5
				+ meditation*1	+ exercize*2	+ running*1 	+ reading*0 			+ photography*0
				+ nina*0		+ social*1		+ family*1		+ interactions*0		+ aquintances*0
				+ walking*0		+ napping*0		+ housework*0	+ cooking*0				+ driving*0
				+ editphoto*1	+ editwrite*0	+ consumption*0	+ overconsumption*(-4);
		String courageString = makeString("courage", courage);
				
		passsion = passsion 
				+ programming*1	+ writing*2		+ edening*2 	+ enterprenuership*5 	+ health*5
				+ meditation*1	+ exercize*1	+ running*1 	+ reading*1 			+ photography*1
				+ nina*1		+ social*0		+ family*0		+ interactions*0		+ aquintances*0
				+ walking*1		+ napping*0		+ housework*0	+ cooking*0				+ driving*0
				+ editphoto*0	+ editwrite*0	+ consumption*0	+ overconsumption*(-3);
		String passsionString = makeString("passsion", passsion);
		
		freedome = freedome 
				+ programming*1	+ writing*3		+ edening*1		+ enterprenuership*2 	+ health*0
				+ meditation*3	+ exercize*0	+ running*0 	+ reading*0 			+ photography*1
				+ nina*(-1)		+ social*0		+ family*(-1)	+ interactions*0		+ aquintances*0
				+ walking*0		+ napping*0		+ housework*0	+ cooking*0				+ driving*1
				+ editphoto*0	+ editwrite*0	+ consumption*0	+ overconsumption*(-5);
		String freedomeString = makeString("freedome", freedome);
		
		stoicism = stoicism 
				+ writing*1		+ enterprenuership*1 	+ health*0
				+ meditation*1	+ driving*0;
		String stoicismString = makeString("stoicism", stoicism);
		
		harshness = harshness 
				+ enterprenuership*4 	+ overconsumption*4;
		String harshnessString = makeString("harshness", harshness);
		
		endurance = endurance 
				+ programming*3	+ writing*1		+ edening*1		+ enterprenuership*3 	+ health*3
				+ meditation*2	+ exercize*1	+ running*2 	+ reading*1 			+ driving*1
				+ editphoto*1	+ overconsumption*(-2);
		String enduranceString = makeString("endurance", endurance);
		
		honesty = honesty 
				+ writing*2		+ enterprenuership*2 	+ health*2
				+ meditation*1	+ photography*1
				+ nina*1		+ social*2		+ overconsumption*(-5);
		String honestyString = makeString("honesty", honesty);
		
		composure = composure 
				+ writing*2		+ enterprenuership*4 	
				+ meditation*5	+ exercize*1	+ running*1 	+ reading*1 			+ photography*1
				+ social*3		+ family*1		+ interactions*0		+ aquintances*0
				+ walking*0		+ driving*1
				+ overconsumption*(-2); 
		String composureString = makeString("composure", composure);
		
		
		//AGILITY CHARACHTERISTICS
		energy = energy 
				+ programming*2	+ writing*2		+ edening*2		+ enterprenuership*3 	+ health*2
				+ meditation*1	+ exercize*1	+ running*1 	+ reading*1 			+ photography*0
				+ nina*1		+ social*2		+ family*1		+ interactions*0		+ aquintances*0
				+ walking*0		+ napping*3		+ housework*1	+ cooking*0				+ driving*1
				+ editphoto*0	+ editwrite*0	+ consumption*0	+ overconsumption*(-4); 
		String energyString = makeString("energy", energy);
		
		focus = focus 
				+ programming*5	+ writing*2		+ edening*3		
				+ meditation*3	+ exercize*1	+ running*1 	+ reading*3 			+ photography*1
				+ napping*2		
				+ editphoto*1	+ overconsumption*(-5); 
		String focusString = makeString("focus", focus);
		
		flexibility = flexibility 
				+ programming*1	+ writing*2		+ edening*1		
				+ meditation*1	+ reading*1 		+ overconsumption*(-2); 
		String flexibilityString = makeString("flexibility", flexibility);
		
		instinct = instinct 
				+ writing*1		+ enterprenuership*2 	
				+ meditation*1	+ exercize*1	+ running*1 	+ reading*1 			+ photography*1
				+ social*1		+ driving*1;
		String instinctString = makeString("instinct", instinct);
		
		
		laziness = laziness 
				+ programming*(-5)	+ writing*(-3)		+ edening*(-2)		+ enterprenuership*(-4) 	+ health*(-3)
				+ meditation*(-3)	+ exercize*(-5)		+ running*(-5) 		+ reading*(-1) 				+ photography*(-1)
				+ nina*(1)			+ social*(-1)		+ family*(1)			
				+ walking*(1)		+ housework*(-1)	+ driving*(-1)
				+ editphoto*(-1)	+ overconsumption*(4); 
		String lazinessString = makeString("laziness", laziness);
		
		addictions = addictions 
				+ programming*(-5)	+ writing*(-3)		+ edening*(-2)		
				+ meditation*(-3)	+ exercize*(-5)		+ running*(-5) 		+ reading*(-1) 		
				+ nina*(1)			+ social*(-1)		+ family*(1)			
				+ napping*(-2)		+ driving*(-2)
				+ editphoto*(-1)	+ overconsumption*(5); 
		String addictionsString = makeString("addictions", addictions);
		
		//Wisdom
		context = context 
				+ programming*1	+ writing*4		+ edening*1		+ health*1
				+ meditation*1	+ reading*1 	+ photography*1
				+ family*2		
				+ editphoto*4	+ editwrite*4	+overconsumption*(-2); 
		String contextString = makeString("context", context);
		
		love = love 
				+ writing*2		
				+ meditation*1	+ photography*1
				+ nina*3		+ social*1		+ family*1		
				+ housework*1	
				+ editphoto*1	+ overconsumption*(-4); 
		String loveString = makeString("love", love);
		
		faith = faith 
				+ programming*2	+ writing*2		+ edening*2		+ enterprenuership*2 	+ health*2
				+ meditation*1	+ reading*1 	
				+ overconsumption*(-2); 
		String faithString = makeString("faith", faith);
		
		
		conciousness = conciousness 
				+ writing*2		+ enterprenuership*1 	
				+ meditation*1	+ reading*1; 	
		String conciousnessString = makeString("conciousness", conciousness);
		
		philosophy = philosophy 
				+ writing*3	
				+ meditation*1	+ reading*1; 	
		String philosophyString = makeString("philosophy", philosophy);
		
		happiness = happiness 
				+ programming*4	+ writing*3		+ edening*3		+ enterprenuership*3 	+ health*3
				+ meditation*1	+ exercize*3	+ running*2 	+ reading*1 			
				+ nina*4		+ social*1		+ overconsumption*(-4); 
		String happinessString = makeString("happiness", happiness);
		
		empathy = empathy 
				+ health*2
				+ reading*1 	+ photography*
				+ nina*3		; 
		String empathyString = makeString("empathy", empathy);
		
		//INTELLECT CHARACHTERISTICS
		ideas = ideas 
				+ programming*2	+ writing*2		+ edening*3		+ enterprenuership*2 	
				+ meditation*1	+ reading*1 	
				+ nina*1		
				+ walking*		+ napping*1		+ housework*1	+ cooking*0				+ driving*1
				+ editphoto*1	+ editwrite*2	+ overconsumption*3; 
		String ideasString = makeString("ideas", ideas);
		
		creativity = creativity 
				+ writing*1		
				+ meditation*2	+ photography*1
				+ napping*1		+ overconsumption*(-2); 
		String creativityString = makeString("creativity", creativity);
		
		generalKnowledge = generalKnowledge 
				+ programming*3	+ writing*1		+ reading*3 			
				+ social*1		+ overconsumption*3; 
		String generalKnowledgeString = makeString("generalKnowledge", generalKnowledge);
		
		memmory = memmory 
				+ programming*4	+ writing*2		
				+ meditation*1	+ exercize*1	+ running*1 	+ reading*3 			
				+ family*1		+ interactions*0
				+ napping*3		+ overconsumption*(-2); 
		String memmoryString = makeString("memmory", memmory);
		
		programmingChar = programmingChar 
				+ programming*5; 
		String programmingString = makeString("programming", programmingChar);
		
		writingChar = writingChar 
				+ writing*5		+ edening*1		
				+ meditation*2	+ exercize*1	+ reading*3 			
				+ walking*1		+ editwrite*5	+ overconsumption*1; 
		String writingString = makeString("writing", writingChar);
		
		confucious = confucious 
				+ writing*1		+ enterprenuership*1 	
				+ meditation*1	+ reading*2 			+ photography*0
				+ nina*1		+ social*2		+ family*1		+ interactions*0		+ aquintances*0
				+ walking*0		+ napping*3		+ housework*1	+ cooking*0				+ driving*1
				+ editphoto*0	+ editwrite*0	+ consumption*0	+ overconsumption*(-4); 
		String confuciousString = makeString("confucious", confucious);
		
		enterprenuershipChar = enterprenuershipChar 
				+ programming*4	+ writing*3		+ edening*2		+ enterprenuership*5 	
				+ nina*2		+ social*3		
				+ editphoto*1	+ editwrite*2	+ overconsumption*(-5); 
		String enterprenuershipString = makeString("enterprenuership", enterprenuershipChar);
		
		 
		economy = economy 
				+ enterprenuership*5
				; 
		String economyString = makeString("economy", economy);
		
		sociology = sociology 
				+ enterprenuership*5 	+ health*2
				+ social*1		+ family*1	; 
		String sociologyString = makeString("sociology", sociology);
		
		
		//ENVIORONMENT CHARACHTERISTICS
		friends = friends 
			+ writing*1		+ enterprenuership*4 	+ photography*1
			+ nina*3		+ social*5		+ family*2		+ housework*1
			+ driving*1
			+ editphoto*1	+ overconsumption*(-1); 
		String friendsString = makeString("friends", friends);
		
		charisma = charisma 
				+ writing*1		+ enterprenuership*3
				+ meditation*1	+ exercize*1	+ running*1 	+ reading*1 			+ photography*1
				+ nina*1		+ social*2		+ family*1		
				+ napping*1		
				+ editphoto*1	+ editwrite*2	+ overconsumption*(-2); 
		String charismaString = makeString("charisma", charisma);
		
		elequency = elequency 
				+ writing*2		+ enterprenuership*2 	
				+ meditation*1	+ reading*1
				+ nina*1		+ social*3		
				+ editwrite*1	; 
		String elequencyString = makeString("elequency", elequency);
		
		influence = influence 
				+ programming*4	+ writing*1		+ enterprenuership*4 	+ photography*1
				+ nina*1		+ social*3		+ family*2		
				+ housework*2	
				+ editphoto*2	+ editwrite*2	+ overconsumption*(-3); 
		String influenceString = makeString("influence", influence);
		
		environment = environment 
				+ programming*2	+ writing*3		+ edening*2		+ enterprenuership*3 	+ health*1
				+ meditation*2	+ exercize*2	+ running*2 	+ reading*3 			+ photography*2
				+ nina*1		+ social*4		+ family*3		+ interactions*0		+ aquintances*0
				+ walking*0		+ napping*3		+ housework*1	+ cooking*0				+ driving*1
				+ editphoto*0	+ editwrite*0	+ consumption*0	+ overconsumption*(-4); 
		String environmentString = makeString("environment", environment);
		
		wit = wit 
				+ programming*2	+ writing*3		+ edening*2		+ enterprenuership*3 	+ health*1
				+ meditation*2	+ exercize*2	+ running*2 	+ reading*3 			+ photography*2
				+ nina*1		+ social*4		+ family*3		
				+ napping*1		+ editwrite*2	+ overconsumption*1; 
		String witString = makeString("wit", wit);
		
		voice = voice 
				+ enterprenuership*2 	
				+ meditation*1	+ exercize*2	+ photography*1
				+ nina*1		+ social*4		+ family*4		+ overconsumption*(-3); 
		String voiceString = makeString("voice", voice);
		
		healthChar = healthChar 
				+ programming*1	+ writing*2		+ edening*1		+ enterprenuership*(-1) 	+ health*5
				+ meditation*3	+ exercize*4	+ running*4 	
				+ nina*1		+ social*2		+ family*2		
				+ walking*1		+ napping*2		+ housework*1	+ overconsumption*(-3); 
		String healthString = makeString("health", healthChar);
		
		gold = gold 
				+ programming*7	+ writing*5		+ edening*5		+ enterprenuership*7 	+ health*10
				+ meditation*5	+ exercize*4	+ running*4 	+ reading*4 			+ photography*3
				+ nina*2		+ social*2		+ family*2		
				+ walking*1		+ napping*1		+ housework*3	+ driving*(-3)
				+ editphoto*2	+ editwrite*3	+ overconsumption*(-4); 
		String goldString = makeString("gold", gold);
		
		
			
			
		//check if variables are == 0
		// checkZero(intellect);		checkZero(intLvl);		checkZero(dexterity);checkZero(dexLvl);		checkZero(strength);		checkZero(strLvl);		checkZero(spiriti);		checkZero(spiLvl);		checkZero(agility);		checkZero(agiLvl);
		
		//make a compilation String of all the information you want saved and name the file after the date name
		String compilation = 
									
				determinationString 	+ courageString 	+ passsionString 	+ freedomeString 
				+ stoicismString		+ harshnessString	+ enduranceString	+ honestyString 
				+ composureString
				
				+ energyString 			+ focusString 		+ flexibilityString + instinctString		
				+ lazinessString 		+ addictionsString 	
				
				+ contextString			+ loveString		+ faithString		+ conciousnessString		
				+ philosophyString 		+ happinessString 	+ empathyString 
				
				+ ideasString			+ creativityString	+ generalKnowledgeString 
				+ memmoryString 		+ programmingString	+ writingString 	+ confuciousString 
				+ enterprenuershipString+ economyString 	+ sociologyString 
				
				+ friendsString 		+ charismaString 	+ elequencyString 
				+ influenceString 		+ environmentString + witString 		+ voiceString 
				+ healthString 			+ goldString;
		
		String saveLocation = "C:\\Users\\alpak\\Desktop\\eden\\edenJavaDocs" + dateName + ".txt";
		input.close();
	
		
		// save all attributes to a save.file
		save write = new save();
		write.save(compilation, saveLocation);
	
	
	}
	
}

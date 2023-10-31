
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MainDisplay {

	private static boolean containsNumbers(String input) {
		Pattern pattern = Pattern.compile("[0-9]");
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<RegList> athleteList = new ArrayList<>();

		RegList athlete1 = new RegList("Alex", "Intermediate", 98.5, "Light-Heavyweight", 2, 5, 209.0, 45.0, 44.0,
				30.0);
		RegList athlete2 = new RegList("Bob", "Elite", 110.6, "Heavyweight", 3, 5, 251.0, 45.0, 66.0, 35.0);
		RegList athlete3 = new RegList("Charlie", "Elite", 96.4, "Light-Heavyweight", 1, 2, 180.0, 18.0, 22.0, 35.0);
		RegList athlete4 = new RegList("Danny", "Beginner", 60.5, "Flyweight", 0, 0, 100.0, 0, 0, 25.0);
		RegList athlete5 = new RegList("Edward", "Elite", 105.7, "Heavyweight", 1, 3, 189.0, 27.0, 22.0, 35.0);
		RegList athlete6 = new RegList("Frank", "Intermediate", 86.2, "Middleweight", 1, 0, 142.0, 0, 22.0, 30.0);

		athleteList.add(athlete1);
		athleteList.add(athlete2);
		athleteList.add(athlete3);
		athleteList.add(athlete4);
		athleteList.add(athlete5);
		athleteList.add(athlete6);

		System.out.println("\n"
				+ "███╗   ██╗ ██████╗ ██████╗ ████████╗██╗  ██╗        ███████╗██╗   ██╗███████╗███████╗███████╗██╗  ██╗             ██╗██╗   ██╗██████╗  ██████╗ \n"
				+ "████╗  ██║██╔═══██╗██╔══██╗╚══██╔══╝██║  ██║        ██╔════╝██║   ██║██╔════╝██╔════╝██╔════╝╚██╗██╔╝             ██║██║   ██║██╔══██╗██╔═══██╗\n"
				+ "██╔██╗ ██║██║   ██║██████╔╝   ██║   ███████║        ███████╗██║   ██║███████╗███████╗█████╗   ╚███╔╝              ██║██║   ██║██║  ██║██║   ██║\n"
				+ "██║╚██╗██║██║   ██║██╔══██╗   ██║   ██╔══██║        ╚════██║██║   ██║╚════██║╚════██║██╔══╝   ██╔██╗         ██   ██║██║   ██║██║  ██║██║   ██║\n"
				+ "██║ ╚████║╚██████╔╝██║  ██║   ██║   ██║  ██║        ███████║╚██████╔╝███████║███████║███████╗██╔╝ ██╗        ╚█████╔╝╚██████╔╝██████╔╝╚██████╔╝\n"
				+ "╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝        ╚══════╝ ╚═════╝ ╚══════╝╚══════╝╚══════╝╚═╝  ╚═╝         ╚════╝  ╚═════╝ ╚═════╝  ╚═════╝ \n"
				+ "                                                                                                                                               \n"
				+ "");
		System.out.println(
				"------------------------------------------------ ᴡᴇʟᴄᴏᴍᴇ ᴛᴏ ɴᴏʀᴛʜ ꜱᴜꜱꜱᴇx ᴊᴜᴅᴏ ᴄᴏꜱᴛ ᴄᴀʟᴄᴜʟᴀᴛᴏʀ ----------------------------------------------------\n");
		while (true) {
			System.out.println(
					"═════════════════════════════════════════════════════════════ ＭＡＩＮ　ＭＥＮＵ ═══════════════════════════════════════════════════════════════════\n");
			System.out.println(
					"\t \t [1] View Athlete Information\t |\t [2] Add Athlete\t |\t [3] Delete Athlete \t |\t [4] Exit\n");
			System.out.println(
					"═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════\n");
			System.out.print("Option: ");

			String option2 = scan.next();
			scan.nextLine();

			switch (option2) {
				case "1":
					viewAthleteInformation(athleteList);
					break;
				case "2":
					addAthlete(athleteList, scan);
					break;
				case "3":
					viewAthleteInformation(athleteList);
					System.out.print("Enter the name of the athlete to delete: ");
					String athleteNameToDelete = scan.nextLine();
					deleteAthlete(athleteList, athleteNameToDelete);
					break;
				case "4":
					System.out.println("Exiting...");
					scan.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid option. Try again.");
			}
		}
	}

	public static void viewAthleteInformation(ArrayList<RegList> athleteList) {
		if (athleteList.isEmpty()) {
			System.out.println("No athlete information available.");
			return;
		} else {
			System.out.println("\n \t \t \t \t \t \t    【﻿　ＡＴＨＬＥＴＥＳ　ＥＮＲＯＬＬＥＤ　】\n");
			for (RegList athlete : athleteList) {
				athlete.format();

			}
		}
		return;
	}

	public static void deleteAthlete(ArrayList<RegList> athleteList, String scan) {
		RegList athleteToDelete = null;

		for (RegList athlete : athleteList) {
			if (athlete.getAthleteName().equalsIgnoreCase(scan)) {
				athleteToDelete = athlete;
				break;
			}
		}

		if (athleteToDelete != null) {
			athleteList.remove(athleteToDelete);
			System.out.println("Successfully Deleted " + athleteToDelete.getAthleteName());
		} else {
			System.out.println("Athlete not found with the given name: " + scan);
		}
	}

	public static void addAthlete(ArrayList<RegList> athleteList, Scanner scan) {
		System.out.println(
				"═══════════════════════════════════════════════════════════════════ Add Athlete  ════════════════════════════════════════════════════════════════ ");
		String athleteName;
		// error handling if user input a number
		do {
			System.out.println("( Must Enter a Name! No numbers!)\nEnter Name: ");
			athleteName = scan.nextLine();
		} while (containsNumbers(athleteName));

		System.out.println("╒════════════════════ Training Plan - Prices ($ USD) ═══════════════════╕");
		System.out.println("| Beginner (2 sessions per week) – weekly fee \t               $ 25.00  |");
		System.out.println("| Intermediate (3 sessions per week) – weekly fee \t       $ 30.00  |");
		System.out.println("| Elite (5 sessions per week) – weekly fee \t \t       $ 35.00  |");
		System.out.println("| Private tuition – per hour \t \t \t \t       $ 9.00   |");
		System.out.println("| Competition entry fee – per competition \t \t       $ 22.00  |");
		System.out.println("╘═══════════════════════════════════════════════════════════════════════╛\n");

		System.out.println("Choose Training Plans:\n");
		System.out.println("[1] Beginner ");
		System.out.println("[2] Intermediate ");
		System.out.println("[3] Elite\n ");
		System.out.print("Enter Training Plan [1, 2, 3]: ");
		int trainingPlanOption;

		// error handling if user input a letter
		try {
			trainingPlanOption = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a number.");
			return;
		}

		String trainingPlan;
		double planCost;
		switch (trainingPlanOption) {
			case 1:
				trainingPlan = "Beginner";
				planCost = 25.00 * 4;
				break;
			case 2:
				trainingPlan = "Intermediate";
				planCost = 30.00 * 4;
				break;
			case 3:
				trainingPlan = "Elite";
				planCost = 35.00 * 4;
				break;
			default:
				System.out.println("Invalid training plan option. Try Again.");
				return;
		}

		double weight = 0.0;
		try {
			System.out.print("Enter Weight (kg): ");
			weight = Double.parseDouble(scan.next());
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a number.");
			return;
		}

		double noOfCompetitions = 0.0;
		try {
			System.out.print("Enter number of competitions entered this month: ");
			noOfCompetitions = Double.parseDouble(scan.next());
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a number.");
			return;
		}

		double noOfHours = 0.0;
		try {
			System.out.print("Enter no. of Hours for Private Coaching (optional, max 5 hours): ");
			noOfHours = Double.parseDouble(scan.next());
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a number.");
			return;
		}

		if (noOfHours > 5) {
			System.out.println("\nProblem Detected! The number of hours has exceeded the maximum!\nTry again ");
			return;
		}

		double competitionsCost;

		double hoursCost = noOfHours * 9.00;

		competitionsCost = noOfCompetitions * 22.00;

		double totalCost = planCost + hoursCost + competitionsCost;

		// Condition for beginner
		if (trainingPlanOption == 1) {
			competitionsCost = 0;
		}

		String weightCategory;

		if (weight <= 66) {
			weightCategory = "Flyweight";
		} else if (weight >= 67 && weight <= 73) {
			weightCategory = "Lightweight";
		} else if (weight >= 74 && weight <= 81) {
			weightCategory = "Light-Middleweight";
		} else if (weight >= 82 && weight <= 90) {
			weightCategory = "Middleweight";
		} else if (weight >= 91 && weight <= 99) {
			weightCategory = "Light-Heavyweight";
		} else if (weight >= 100) {
			weightCategory = "Heavyweight";
		} else {
			weightCategory = "Invalid Input\n Must be at least 66 kg to be enrolled";
		}

		RegList athlete = new RegList(athleteName, trainingPlan, weight, weightCategory, noOfCompetitions, noOfHours,
				totalCost, hoursCost, competitionsCost, planCost);
		athleteList.add(athlete);
		

		System.out.println("Athlete has been successfully added.");
		return;
	}
}

class RegList {
	private String athleteName;
	private String trainingPlan;
	private String weightCategory;
	private double weight;
	private double noOfCompetitions;
	private double noOfHours;
	private double totalCost;
	private double hoursCost;
	private double competitionsCost;
	private double planCost;

	public RegList(String athleteName, String trainingPlan, double weight, String weightCategory,
			double noOfCompetitions, double noOfHours, double totalCost, double hoursCost,
			double competitionsCost, double planCost) {
		this.setAthleteName(athleteName);
		this.setTrainingPlan(trainingPlan);
		this.setWeightCategory(weightCategory);
		this.setWeight(weight);
		this.setNoOfCompetitions(noOfCompetitions);
		this.setNoOfHours(noOfHours);
		this.setTotalCost(totalCost);
		this.setHoursCost(hoursCost);
		this.setCompetitionsCost(competitionsCost);
		this.setPlanCost(planCost);
	}

	public String getAthleteName() {
		return athleteName;
	}

	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}

	public String getTrainingPlan() {
		return trainingPlan;
	}

	public void setTrainingPlan(String trainingPlan) {
		this.trainingPlan = trainingPlan;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getNoOfCompetitions() {
		return noOfCompetitions;
	}

	public void setNoOfCompetitions(double noOfCompetitions) {
		this.noOfCompetitions = noOfCompetitions;
	}

	public double getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(double noOfHours) {
		this.noOfHours = noOfHours;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getHoursCost() {
		return hoursCost;
	}

	public void setHoursCost(double hoursCost) {
		this.hoursCost = hoursCost;
	}

	public double getCompetitionsCost() {
		return competitionsCost;
	}

	public void setCompetitionsCost(double competitionsCost) {
		this.competitionsCost = competitionsCost;
	}

	public double getPlanCost() {
		return planCost;
	}

	public void setPlanCost(double planCost) {
		this.planCost = planCost;
	}

	public String getWeightCategory() {
		return weightCategory;
	}

	public void setWeightCategory(String weightCategory) {
		this.weightCategory = weightCategory;
	}

	public void format() {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");

		System.out.println("\t \t \t \t╒══════════════════════════ Athlete Information ════════════════════════╕");
		System.out.println("\t \t \t \t  Name: \t \t \t \t \t" + getAthleteName());
		System.out.println("\t \t \t \t  Training Plan:\t \t \t \t" + getTrainingPlan());
		System.out.println("\t \t \t \t  Weight [kg]: \t \t \t \t \t" + getWeight() + " Kg");
		System.out.println("\t \t \t \t  Competition Weight Category: \t \t \t" + getWeightCategory());
		System.out.println("\t \t \t \t  No. of Competitions Entered this Month: \t" + getNoOfCompetitions());
		System.out.println("\t \t \t \t  Private Coaching Hours: \t \t \t" + getNoOfHours());
		System.out.println("\t \t \t \t ----------------------------------------------------------------------");
		System.out.println("\t \t \t \t  ITEMIZED COST\n ");
		System.out.println("\t \t \t \t  \tTraining Plan Cost:\t \t \t$ " + decimalFormat.format(getPlanCost()));
		System.out.println("\t \t \t \t  \tPrivate Coaching Hour Cost:\t \t$ " + decimalFormat.format(getHoursCost()));
		System.out.println("\t \t \t \t  \tCompetition Cost:\t \t \t$ " + decimalFormat.format(getCompetitionsCost()));
		System.out.println("\t \t \t \t   \tTotal Cost:\t \t \t \t$ " + decimalFormat.format(getTotalCost()));
		System.out.println("\t \t \t \t╘═══════════════════════════════════════════════════════════════════════╛\n");

	}

}

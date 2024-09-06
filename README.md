# North Sussex Judo Cost Calculator

This is a Java-based console application that allows users to manage athlete information and calculate their training costs. The application includes features such as viewing, adding, and deleting athletes while calculating the costs based on their selected training plans and other factors.

## Table of Contents

- [Features](#features)
- [Usage](#usage)
- [Athlete Information](#athlete-information)
- [Training Plans](#training-plans)
- [How to Run](#how-to-run)
- [Dependencies](#dependencies)
- [License](#license)

## Features

1. **View Athlete Information**: Displays a list of enrolled athletes with their details.
2. **Add Athlete**: Adds new athletes to the list with a training plan, weight category, and calculated costs.
3. **Delete Athlete**: Removes an athlete from the list by name.
4. **Training Cost Calculator**: Calculates total cost based on training plan, number of private coaching hours, and competitions entered.

## Athlete Information

Each athlete has the following attributes:
- **Name**: The athlete's name (validated to avoid numbers in the input).
- **Training Plan**: The selected training plan (Beginner, Intermediate, Elite).
- **Weight**: The athlete's weight to determine the weight category.
- **Competitions**: The number of competitions entered in a month.
- **Private Coaching**: The number of hours for private coaching (optional, with a maximum of 5 hours).
- **Total Cost**: The total calculated cost based on the selected plan, competitions, and private coaching.

## Training Plans

The following training plans are available:
- **Beginner** (2 sessions per week): $25/week
- **Intermediate** (3 sessions per week): $30/week
- **Elite** (5 sessions per week): $35/week
- **Private Tuition**: $9/hour
- **Competition Entry Fee**: $22/competition

> Note: Competitions are free for the Beginner training plan.

## Usage

When you run the program, you'll be presented with a main menu to choose from the following options:
1. View Athlete Information
2. Add Athlete
3. Delete Athlete
4. Exit

Follow the prompts to view or manage athlete data.

### Example Usage:

- **Add Athlete**: You will be prompted to input the athlete's name, select their training plan, and enter the number of competitions and private coaching hours. The total cost will be calculated and the athlete will be added to the system.
- **View Athlete**: Displays the details of all enrolled athletes.
- **Delete Athlete**: Enter the name of the athlete to delete them from the list.

## How to Run

1. Clone the repository or download the Java files.
2. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA, or VSCode).
3. Compile and run the `MainDisplay.java` file.

```bash
# Example for compiling and running from the command line:
javac MainDisplay.java
java MainDisplay

```

## Dependencies

This project requires no external libraries. It uses standard Java libraries like Scanner, ArrayList, and Regex.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

You can copy this and adjust any sections if you want to provide more specific details about your project!


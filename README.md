<p align="center">
  <img align="center" src="https://www.ithsdistans.se/pluginfile.php/1/core_admin/favicon/64x64/1723553478/ITHS_LOGO_SMALL.png" />
</p>
<h1 align="center">
  <strong>Tic-Tac-Toe</strong>
</h1>
<p align="center">
  A JavaFX implementation using sockets of the classic game Tic-Tac-Toe
</p>
<p align="center">
  <b>Built with</b>
  <br />
  <img alt="JavaFX"  width="70px" src="https://upload.wikimedia.org/wikipedia/en/c/cc/JavaFX_Logo.png"/>
</p>

## About

This project was built for an assignment at [IT-Högskolan](https://www.iths.se/). The goal was to use JavaFX to create a Tic-Tac-Toe game using the MVC architecture.
The project allows you to play against a computer.

## Technologies & Libraries

- **Java** - Core programming language used.
- **JavaFX** - Library used to create the graphical user interface.

## What I learned

This project allowed me to gain experience in several new areas:
- **MVC Design Pattern** - Applied the Model-View-Controller (MCV) pattern within a graphical application.

## Installation and Setup

1. Clone the repository:
   
   ```bash
   git clone https://github.com/kirre02/tic-tac-toe.git
   cd tic-tac-toe
   ```
3. Ensure you have Java installed (this project is developed with JDK 22)
   - You can install java from [here](https://www.oracle.com/se/java/technologies/downloads/archive/)
4. Open the project in [IntelliJ IDEA](https://www.jetbrains.com/idea/):
   - Go to **File > Open** and select the project folder
   - Intellij should detect the project structure and automatically set up the necessary configurations.
5. Run the client:
   - Open `GameApplication.java`, and select the **Run TicTacToe'** option.

## Possible Upgrades

If I were to continue building on this project these are a few enhancements I would implement:

- **Enhanced Styling** - Add player customizability and polished styles to the game
- **Online Option** - Would be possible to add a websocket server so that the player has the possibility to play against other players and not only against the computer.
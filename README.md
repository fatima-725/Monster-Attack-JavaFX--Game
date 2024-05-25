# Monster Attack Game

## Overview
Monster Attack is an entertaining 2D game that also serves as a brain exercise. Players must concentrate to help the avatar survive as long as possible without being attacked by monsters. The game combines data structures and GUI implementation to create an easy-to-understand and enjoyable experience. It is designed to be played on any system with a Java Virtual Machine (JVM).

## Objectives
- Create a 2D game using data structures and GUI implementation.
- Provide an entertaining and engaging game for users.
- Ensure compatibility with any system that has JVM installed.

## Description
In Monster Attack, players control an avatar to avoid getting caught by monsters. The game provides a top view of the entire scene. Each player starts with 3 lives per run, and the game continues until all lives are exhausted. After losing all lives, players can choose to restart or end the game. The game displays the avatar's score, showing the lowest time and highest distance covered, which determines the rank.

## CRUD Functions
The game includes several functional requirements to capture the intended behavior:

- **Menu()**: Displays options like New Game, Ranks, or Quit Game.
- **Table()**: Shows all ranks with names and times.
- **Controller()**: Sets the locations of enemies and the player.
- **AddEnemy()**: Adds enemies using locations set by the controller.
- **SortedInsert()**: Inserts the player’s name and time in a sorted linked list.
- **ReadFromFile()**: Reads data from a file, storing it in a linked list.
- **CallFileStore()**: Writes data to a file from a linked list.
- **Collision()**: Counts the number of times the player collides with an enemy and decreases lives accordingly.
- **TimerTask()**: Counts the number of seconds passed.
- **Update()**: Updates the locations of enemies and the player as the game continues.
- **Player()**: Controls the player and measures the distance covered.

## Installation
To run Monster Attack, ensure you have Java installed on your system. Download the game files and execute the main program using a Java IDE or command line.

## How to Play
1. Start the game and select "New Game" from the menu.
2. Use the arrow keys to move the avatar and avoid monsters.
3. Each collision with a monster reduces your lives by one.
4. The game ends when all lives are lost. You can then choose to restart or exit.
5. Your score, based on the time and distance covered, will be displayed and ranked.

## Future Enhancements
- Adding more levels and different types of enemies.
- Introducing power-ups and special abilities for the avatar.
- Enhancing graphics and sound effects for a more immersive experience.
- Implementing multiplayer mode for competitive play.

Enjoy playing Monster Attack and sharpen your concentration skills while having fun!

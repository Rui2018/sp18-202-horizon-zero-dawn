# Horizon-Zero-Dawn, Sprint #1

## XP values:
Communication: Talk with all the team members and exchange our ideas on what kind of game we want to make. Figure out the best plane that will suit and envolve everyone in our team together. 

## Team member name:
Nanzhu Zhang

### What I plan to do:
1. Discuss with my team members and decide what game we plane to build and the basic rules of the game.
2. Once decided, start to build basic classes needed for the game and choose a design pattern that suit our game. 

## Team member name:
Shikai Jin

### What I plan to do
1. Discuss withe teamates to find a game design for this project
2. Setting my personal develop schedule for the project in the following month

## Team member name:
Rui Guo

### What I plan to do:
1. Discuss with my teammates, and design a game that we are all interested.
2. Decide the game rules.
3. Discuss what design patterns we can use.
4. Make team plan and personal plan for the project.

## Team member name:
Fan Wu

### What I plan to do:
1. Discuss with teammates.
2. Research for game ideas/baseline, design patterns that we could use.
3. Research for game flow, game design.

## Team member name:
Yanjun Zang

### What I plan to do:
1. Discuss with teammates to decide what game we will create.
2. Research tutorials to be familiar with greenfoot.
3. Try to write a sample game as a practice to get more familiar with greenfoot engine.
4. Find image sources used for game.
5. Decide the game rules with teammates.

___
# Horizon-Zero-Dawn, Sprint #2

## XP values:
Simplicity: Learn to take small simple steps to our goal. Decomposite one kind of composite task to several small easier tasks and try to complete them gradually. 

## Team member name:
Nanzhu Zhang

### What I did since the last weekly scrum:
1. Decided to build game scenario 2 which will include instructions which will show the players how to play the game. 
2. Choose proxy design pattern for our game. That is only the players who paid for the game(have the password to the game) will be able to enter the game. 

### What I plan to do:
1. Try to implement the scenario 2, add instructions in the appropriate location. 
2. Build the frame of proxy design pattern.
3. Complete the class diagram of proxy design pattern. 

### What blockers I have:
1. Need to get familiar with greenfoot. 

## Team Member name:
Shikai Jin

### What I did since the last weekly scrum:
1. Read understanding the basic code structure set by Yanjun
2. Try to write the basic structure for scenairo 4

### What I plan to do:
1. Finish scenario 4, adding images for the star and background etc. in this level
2. Add functions to let the jumper be able to go with the ground in the scene rather than standing still when the ground is moving

### What blockers I have:
The greenfoot structure needs some time to understand and transform into the shape I need it be.

## Team member name:
Rui Guo

### What I did since the last weekly scrum:
1. Find the suitable solution of the problem, and be familiared with the game flow.
2. Decided to implement the scenario 5, and use factory method pattern to create energies in different scenarios.
3. Find some image for the game.

### What I plan to do:
1. Try to finish scenario 5, and use appropriate classes and images.
2. Build the frame of Factory design pattern.
3. Learn some toturials of greenfoot.

### What blockers I have:
Be familiar with greenfoot. 

## Team member name:
Fan Wu

### What I did since the last weekly scrum:
1. Researched for several game ideas, familiarized myself with game design/flow.
2. Came up with the basic idea of first senario.

### What I plan to do:
1. Implement first senario for moving instruction.
2. Implement the Command design pattern for new/return player.

### What blockers I have:
1. Familiarize with greenfoot.

## Team member name:
Yanjun Zang

### What I did since the last weekly scrum:
1. Learned some tutorials to be familiar with greenfoot, such as youtube videos, greenfoot community.
2. Developed a dice game. Generate random numbers reflecting by dice images.
3. Charactor can moves according to the value of dice.
3. Find image sources used for game.

### What I plan to do:
1. Implement the prototype game, called jump & eat.
2. Apply one of the design pattern to the game.

### What blockers I have:
1. An actor in the dice game can not move smoothly, there are some bugs.

___
# Horizon-Zero-Dawn, Sprint #3

## XP values:
Respect: Respect everyone as a valued team member. Every is trying their best to make progress for our project. We all contribute value to our team.  

## Team member name:
Nanzhu Zhang

### What I did since the last weekly scrum:
1. Added all the instructions for the players. 
2. Make the instructions disappear if the jumper passed through. 
3. Added a TitleScreen to the game which implements the proxy interface. 
4. Added a dialog box to interact with the player so the input can be read in from the player to verify the password. 
5. Proxy class diagram. 

### What I plan to do:
1. Complete the instruction, change the format so it suits the game.
2. Change the rules of this scenario so it will be easier than the rest scenarios.
3. Complete the proxy part. Check password entered by the player, if right enter the game otherwise stay in this page. 
4. Complete use case and sequence diagram of the “enter the game” use case. 

### What blockers I have:
1. Tried several different strategies but still cannot make the instructions be invisible at the beginning and then appear when the jumper getting closer.
2. The cancel button in the popup screen will cause problem. 

## Team member name:
Shikai Jin

### What I did since the last weekly scrum:
1. Finsh the scenario 4 in the game
2. Change the behavior of the ground to make the jumper be able to go with the ground

### What I plan to do:
1. Play the game and try to debug
2. Finish the documents listed in the requirements

### What blockers I have:
1. Tried to apply observer pattern to the ground-jumper pair and failed due to greenfoot deisng for actors

## Team member name:
Rui Guo

### What I did since the last weekly scrum:
1. Almost complete scenario 5.
2. Realize the functions in different classes in the project, such as Jumper, StarForest, Ground, Enemy, Score.
3. Fix the bugs to make the jumper move with the ground when it is on the moving ground.
4. In order to increase the difficulty of the scenario, add some stones, when the jumper meets the stone, it will die.
5. Almost finish the factory pattern.

### What I plan to do:
1. In order to make it more diffcult, modify the act method of StarForest so that it is harder to be "eated".
2. Complete factory pattern.
3. Merge my scenatio with other scenarios.
4. Add some cute images.
5. Fix bugs existed.

### What blockers I have:
1. The jumper cannot shoot.
2. The jumper cannot always move with the ground.
3. The ground would move out of the world.
4. The bullet would not disappear when it is at the edge.
5. The sound play had some problems.

## Team member name:
Fan Wu

### What I did since the last weekly scrum:
1. Collaboratee with teammates to complete first senario.
2. Modify some classes to suit the need of senario 1. (still stars, remove enemy, reset the game when jumper falls)

### What I plan to do:
1. Implement command pattern.
2. Discuss with my teammates to set the appropriate sequence of scenarios.
3. Merge the senario with the rest of the project.

### What blockers I have:
1. Implement command pattern with proxy pattern involved.

## Team member name:
Yanjun Zang

### What I did since the last weekly scrum:
1. Almost complete the prototype.
2. Jumper can move left, right and jump or fall to a ground with some gravity.
3. Apply observer pattern to jumper and enemy. Enemy will always move towards to jumper to "kill" jumper.
4. Enemy generation policy: Every one second, from left bottom or right bottom.
5. Star are distributed and move randomly all around the screen.
6. Some grounds are still, while some grounds can move with different speed. Also, if ground touch the edge of the world, it will change the direction to move.
7. Add game over image and sound effect when jumper touch an enemy or fall over.
8. Add win image and sound effect when jumper eat all stars.
9. Jumper can shoot, when the bullet touch an enemy, the enemy will disappear.
10. Jumper can catch star, the star will disappear and jumper get one score.
11. Show the score at the right top corner.
12. Add "nyan_cat" as a background music playing in loop until game end.
13. Add sound effects for the actions: jump, shoot, eating stars.

### What I plan to do:
1. Final integration and test.
2. Fix bugs.
3. Refactor.

### What blockers I have:
1. Bullet can not move after being generated.
2. Bullet should move to the direction where the jumper is facing, but the bullet is not moving as expected.
3. Ground will move out of scope.
4. Jumper is not standing on the ground exactly, there are several pixel gap between then.
5. Music can not stop with game ends.
6. Bullets move out of the scope.
7. Jumper can not fall down when stepping out of the ground.
8. The game doesn't end when jumper falls to the bottom edge.

___
# Horizon-Zero-Dawn, Sprint #4

## XP values:
Courage: Need to tell the truth about progress. During the last sprint, we combined our work together thus a lot of problems happened. We have to have the courage the tell the truth where the problem is and how to solve it. We have to adapt to changes to the work we've done. 

## Team member name:
Nanzhu Zhang

### What I did since the last weekly scrum:
1. Solved the problem, make the instructions appear when the jumper getting closer.
2. Completed the proxy pattern. 
3. Completed the diagrams. 
4. Resolved the problem with the cancel button in the popup screen. 

### What I plan to do:
1. Discuss with my team members on how to make our ad video. 

## Team member name:
Shikai Jin

### What I did since the last weekly scrum:
1. Debug the game, fix some bugs
2. Maintain the scrum task board
3. Add some documents

### What I plan to do:
Finish all the left tasks in the project

### What blockers I have:
1. Some requiremnts are not clear enough, needs some time to get the concept built.

## Team member name:
Rui Guo

### What I did since the last weekly scrum:
1. Fixed bugs in the project and made the game more smooth.
2. Created the stones at random place at the top of the world, and fall in a certain speed. 
3. Modified the act of the carrots(class starForest), so that it will rebound to the opposite direction when meet other objects except for the jumper. It is more difficult to "eat" all the carrots(class starForest).
4. Realize the exchange between different scenarios. When the jumper "eat" all the stars in current scenario, it will enter next level(scenario) automatically.
5. Modify some classes and parameters.
6. Finish factory design pattern.
7. Add some images to decorated the scenario.
8. Drew some diagrams.

### What I plan to do:
1. Draw diagrams.
2. Finish other documents and requirements.

### What blockers I have:
1. When chenging the world, the music cannot play continuously.
2. Need some time to finish some requirments.

## Team member name:
Fan Wu

### What I did since the last weekly scrum:
1. Made progress merging the project.
2. Debug the game.
3. Create diagrams.

### What I plan to do:
1. Finish up the command pattern.
2. Smoothen the game flow.

### What blockers I have:

## Team member name:
Yanjun Zang

### What I did since the last weekly scrum:
1. Fix bugs of changing world, game can not start automatically after world changes.
2. Reorganize whole game, such as remove redundent jumper, remove other useless ground and refactor star class.
3. After merging, music cannot stop and game cannot stop nomarlly, so add state class to record game status.
4. Fix bug when in instruction world, that the game over appear when jumper falls down.
5. Applay two game over strategies for instruction levels and normal levels, in instruction levels, jumper won't die and game can restart from current level automatically; in normal levels jumper has only one chance.
6. Stop playing music until typing the password.
7. Before all worlds share one background music from level one, while now all levels can start their own background music when game starts(same music file) and game stops music stops.
8. Change parameters: jumpstrenth value, music volume, ground position and speed.

### What I plan to do:
1. Draw diagrams.
2. Write reports.

### What blockers I have:
1. Music still plays when game over.
2. Need to distinguish instruction levels and normal levels.


# android-assn2
Android Assignment 2

# World of Warcraft Quiz Checklist

- [ ] Implement SafeArgs
- [ ] NavDrawer Menu Implemented
- [ ] Overflow Menu implemented
- [ ] Overflow menu has items for About and Rules pages
- [ ] About page 
  - [ ] Image
  - [ ] Text (in ScrollView)
  - [ ] Navigation with <- back arrow
- [ ] Rules Page
  - [ ] Image
  - [ ] Text (in ScrollView)
  - [ ] Navigation
- [ ] Title Page as starting destination
- [ ] All game state is kept in the ViewModel
- [ ] All game logic is kept in the ViewModel
- [ ] Used Data Binding and LiveData to display the Question and current Score
- [ ] Display the X or ✓ on the user hitting True or False to tell them whether they got the Question Correct or incorrect
- [ ] True and False radio buttons have nothing checked for unanswered Questions
- [ ] Wrap around to the first question if on last question
- [ ] Wrap back to last question if on first
- [ ] Once a question has been answered it should save the results (The X or ✓ icon, and which button was pressed) and disable the true/false buttons
- [ ] All game logic and data is stored in the ViewModel
- [ ] When all the questions have been answered the game goes to the game over screen and passes the score via SafeArgs
- [ ] Navigation to the game over screen is triggered by an event raised in the ViewModel and observed in the UI Controller
- [ ] Game Over Screen
  - [ ] Image
  - [ ] Score
  - [ ] Navigation (<- back arrow)
- [ ] All Screens have the appropriate titles in the action bar
- [ ] Meaningful identifier names are used throughout
- [ ] No hardcoded resources, strings, dimensions, etc are in resource files
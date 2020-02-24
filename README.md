# BBCTestTask

- Prerequisites: for running test you should have installed [IntellijIdea](https://www.jetbrains.com/idea/download/#section=windows) and [Google Chrome browser](https://www.google.ru/intl/ru/chrome/?brand=CHBD&gclid=Cj0KCQjwxYLoBRCxARIsAEf16-sx6--sZ-WPL-TBg_QWWB-HaH6t6ZnYa9DbYQLEgrKVsOHpwCwWCpcaAuQQEALw_wcB&gclsrc=aw.ds) 

### Steps to running test app with IntellijIDEA:
1. Import project 
- Сhoose 'checkout from version control' option, Git from dropdown
- URL for cloning: [https://github.com/AlexTsybulko/BBCTestTask.git](https://github.com/AlexTsybulko/BBCTestTask.git)
2. Import changes for maven projects as Intellij suggested after project opening
3. Press Ctrl+N for class searching and search for **BBCRegistrationTest** class
4. Press Ctrl+Shift+F10 for running test for the first time (Shift+F10 for following attempts).

_Note:_ If message "session not created: This version of ChromeDriver only supports Chrome version 'version №'" appears, 
your chrome version is incompatible with chromeDriver version (implemented for version 80), so you can download 
suitable chrome driver version [here](http://chromedriver.chromium.org/downloads) and should place it in *BBCTestTask\src\main\resources* folder.

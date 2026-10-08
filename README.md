# Kontoappen

En enkel konsolapplikation i Java.

## 1. Datasäkerhet / Inkapsling

Jag har skyddat kontots uppgifter genom att göra `name` och `balance` privata. De kan därför inte ändras direkt utifrån. Man måste använda metoder som `getBalance()`, `deposit()` och `withdraw()`. 
I konstruktorn och metoderna finns också kontroller som förhindrar negativa eller ogiltiga belopp.

## 2. Skapande-mönster / Factory

Kontot skapas via `AccountRegister` för att dela upp ansvaret mellan klasserna. `Main` hanterar användarens val och inmatning medan `AccountRegister` skapar nya `Account`-objekt och sparar dem i listan. 
Det gör koden tydligare och allt hantering av konton finns samlad på ett ställe.

## 3. Flöde

Om user väljer `3` för att sätta in pengar frågar `Main` först efter kontots namn. `AccountRegister` söker efter kontot med `findAccount()` och om det hittas får användaren ange ett belopp. 
Inmatningen kontrolleras först så att den är ett heltal och sedan kontrollerar `deposit()` att beloppet är större än `0` innan saldot ändras och det nya saldot skrivs ut.

## 4. Reflektion

När jag arbetade med felaktig inmatning märkte jag att vanliga `if` och `while` villkor inte räckte när användaren skrev fel typ av värde, till exempel text där programmet väntade sig ett heltal. Med hjälp av ChatGPT lärde jag mig hur `hasNextInt()` kan användas för att kontrollera inmatningen innan den läses in och hur `isBlank()` kan användas för att kontrollera tomma namn. Efter det insåg jag att samma kontroll annars skulle behöva upprepas på flera ställen, så jag skapade två egna metoder i Main för validerad inmatning av heltal och namn och återanvände dem i programmet.

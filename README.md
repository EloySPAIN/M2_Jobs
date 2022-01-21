# M2_Jobs
Eloy, Isabel, Víctor

Ejercicio M2 - JOBS

M5: Exercici Jobs
Una empresa ens demana desenvolupar un software per gestionar el sous del seus empleats.
MILESTONE 1
El sistema de pagament dependrà de l’empleat. Hi ha quatre tipus:
- Manager: cobren un 10% més del seu salari mensual.
- Boss: cobren un 50% més del seu salari mensual.
- Employee: cobren el sou mensual aplicant una reducció del 15%
- Volunteer: no cobren
S’ha de crear un projecte, C# de consola, amb les funcionalitats demanades per tal que el software funcioni correctament.
MILESTONE 2
Modifica el programa perquè existeixin 3 tipus d'empleats. Junior, Mid i Senior.
Han d'heretar d'empleats. Aquests empleats tenen una reducció del: 15, 10 i 5% de sou respectivament respecte a la base.
Afegeix una validació de sous al introduir-los (utilitza excepcions):
• Boss: Ha de cobrar més de 8000€
• Manager: Ha de cobrar més de 3000 però menys de 5000€
• Senior: Ha de cobrar més de 2700 pero menys de 4000€
• Mid: Ha de cobrar més de 1800 pero menys de 2500€
• Junior: Ha de cobrar més de 900 pero menys de 1600€ Volunteer: S'ha de validar que no cobra.
MILESTONE 3
Fes una modificació als models, aquest han de tenir sou net y brut mensual, sou net y brut anual. El sou net s’ha d’autocalcular al restar el % d’IRPF del sou brut (Boss: 32% ,Manager: 26% ,Senior: 24%, Mid: 15%, Junior: 2%).
El voluntari pot tenir un ajut governamental podent cobrar fins a 300€ però s'ha d'indicar que és un ajut.
Has de crear una funció que permeti emetre un bonus a tota la plantilla. Aquest bonus és un 10% del sou anual de cada empleat. Els volunteers no reben aquest bonus.


from calculator import Calc
from scientificCalculator import calc
# object instance
calculator = Calc()
scicalc = calc()

MENU = """\n
Por favor, digite el número correspondiente a alguna de las 
siguientes opciones:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Elevar al cuadrado
6. Raiz cuadrada
7. Salir\n\n
"""

while True:
    print(MENU)
    option = int( input() )

    if option == 1: # sumar
        num1 = int( input("\nIngrese el primer número de la suma:") )
        num2 = int( input("\nIngrese el segundo número de la suma:") )
        print(f"\nEl resultado de la suma es: { calculator.sum(num1, num2)} ")
    elif option == 2: # restar
        num1 = int( input("\nIngrese el primer número de la resta: ") )
        num2 = int( input("\nIngrese el segundo número de la resta: ") )
        print(f"\nEl resultado de la resta es: { calculator.substract(num1, num2) }")
    elif option == 3: # multiplicar
        num1 = int( input("\nIngrese el primer número de la multiplicación: ") )
        num2 = int( input("\nIngrese el segundo número de la multiplicaciónL ") )
        print(f"\nEl resultado de la multiplicación es: { calculator.multiplication(num1, num2) }")
    elif option == 4: # division
        enumerator = int( input("\nIngrese el numerador de la división: ") )
        denominator = int( input("\nIngrese el denominador de la división: ") )
        print(f"\nEl resultado de la división es: { calculator.division(enumerator, denominator) }")
    elif option == 5: # square
        num1 = int( input("\nIngrese el numero a elevar al cuadrado: ") )
        print(f"\nEl resultado es: { scicalc.square(num1) }")
    elif option == 6: # sqrt
        num1 = int( input("\nIngrese el numero a buscar raiz cuadrada: ") )
        print(f"\nEl resultado es: { scicalc.raiz(num1) }")
    elif option == 7: # salida
        break
    else:
        print("Por favor, seleccione una opción valida.")

# snake, water, gun game

def gamewin(comp, you):
    if comp==you:
        return None
    elif comp== 's':
        if you == 'w':
            return False
        elif you == 'g':
            return True
    elif comp== 'w':
        if you == 's':
            return True
        elif you == 'g':
            return False
    elif comp== 'g':
        if you == 'w':
            return True
        elif you == 's':
            return False
import random
rndm=random.randint(1, 3)

if rndm==1:
    comp="s"
elif rndm==2:
    comp="w"
elif rndm==3:
    comp="g"

print("computer chossed and now,")
you=input("your turn : Snake(s) Water(w) Gun(g) ?")

a=gamewin(comp, you)

print(f"computer choose {comp}")
print(f"you choosed {you}")
if a== None:
    print("Become's tie")
elif a == True:
    print("You Win !!")
else:
    print("You lose!"





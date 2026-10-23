class bankacc:
    def __init__(self,an,name):
        self.an=an
        self.name=name
        self.b=0.0

    def deposite(self,amt):
        if amt<0:
            print("Invalid")
        else:
            self.b+=amt
            print("DOne deposit")
    def withdraw(self,amt):
        if amt<0:
            print('innvalid')
        elif amt>self.b:
            print("Insufficient balance")
        else:
            self.b-=amt
            print("done withdraw")
    def display(self):
        print(f"Acc no : {self.an} | Acc holder : {self.name} | Balance : {self.b : .2f}")

class bankman:
    def __init__(self):
        self.accts={}

    def create(self):
        an=int(input("enter the accc no:"))
        if an in self.accts:
            print("acc already found")
        else:
            n=input("Enter name:")
            self.accts[an]=bankacc(an,n)

    def gc(self):
        an=int(input("Enter acc no : "))
        acc=self.accts.get(an)
        if acc is None:
            print("Acc not found")
        return acc

    def dm(self):
        acc=self.gc()
        if acc:
            amt=int(input("Enter amt : "))
            acc.deposite(amt)
            print(f" Balance : {acc.b : .2f}")

    def wm(self):
        acc=self.gc()
        if acc:
            amt=int(input("Enter amt : "))
            acc.withdraw(amt)
            print(f" Balance : {acc.b : .2f}")
    def balance(self):
        acc=self.gc()
        if not acc:
            return
        acc.display()
        
    def getaccts(self):
        if not self.accts:
            print("no accts")
            return

        for i in self.accts.values():
            i.display()

bank=bankman()

while True:
    print("WELCOME")
    print("1.Create acc")
    print("2.deposite")
    print("3.withdraw")
    print("4.balance")
    print("5.all accts")
    print("6.exit")

    try:
        ch=int(input("Enter choice:"))
    except ValueError:
        print("Invalid")
        continue

    match ch:
        case 1:
            bank.create()
        case 2:
            bank.dm()
        case 3:
            bank.wm()
        case 4:
            bank.balance()
        case 5:
            bank.getaccts()
        case 6:
            print("thank you")
            break
        

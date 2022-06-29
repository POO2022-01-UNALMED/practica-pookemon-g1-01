from gestorAplicacion.entrenador.Entrenador  import Entrenador
from gestorAplicacion.entrenador.EntrenadorGimnasio  import EntrenadorGimnasio
from gestorAplicacion.entrenador.EntrenadorRoket  import EntrenadorRoket
from gestorAplicacion.lugares.Gimnasio  import Gimnasio
from gestorAplicacion.lugares.CentroPokemon import CentroPokemon
from gestorAplicacion.lugares.CampoDeBatalla import CampoDeBatalla
from gestorAplicacion.pokemon.Habilidad import Habilidad
from gestorAplicacion.pokemon.Pokemon import Pokemon
from basesDatos.deserializador import Deserializador
from basesDatos.serializador import Serializador
import random


class POOkemon():

    _lista_Pokemon = []
    _Roket = EntrenadorRoket(None,None,None)
    _Gym = Gimnasio("UNALMED",None)
    _Centro_Pokemo = CentroPokemon()
    _Campo_Batalla = CampoDeBatalla()
    

    @classmethod
    def generar_lista(cls):
        cls._lista_Pokemon = []
        cls._lista_Pokemon.append(Pokemon("Pikachu"))
        cls._lista_Pokemon.append(Pokemon("Electrode"))
        cls._lista_Pokemon.append(Pokemon("Voltorb"))
        cls._lista_Pokemon.append(Pokemon("Squirtle"))
        cls._lista_Pokemon.append(Pokemon("Gyarados"))
        cls._lista_Pokemon.append(Pokemon("Tentacool"))
        cls._lista_Pokemon.append(Pokemon("Charmander"))
        cls._lista_Pokemon.append(Pokemon("Ponyta"))
        cls._lista_Pokemon.append(Pokemon("Magmar"))
        cls._lista_Pokemon.append(Pokemon("Gastly"))
        cls._lista_Pokemon.append(Pokemon("Ekans"))
        cls._lista_Pokemon.append(Pokemon("Muk"))
        cls._lista_Pokemon.append(Pokemon("Bulbasur"))
        cls._lista_Pokemon.append(Pokemon("Gloom"))
        cls._lista_Pokemon.append(Pokemon("Venusaur"))
        return cls._lista_Pokemon

    @classmethod
    def Pokemon_rival(cls):
        return random.choice(cls._lista_Pokemon)

    @classmethod
    def Crear_Etrenador(cls):
        nombre = input("ingrese su nombre: ")
        a = "si"
        medalla = []
        while a == "si" or a == "Si":
            medalla.append(input("ingrese su medalla: "))
            a = input("tiene mas medallas?  ")
        
        
        print("ingrese Si, si quiere pertenecer a un gimnasio, de lo contrario, igrese No")
        desicion = input()
        if desicion == "Si" or desicion == "si":
            jugador = EntrenadorGimnasio(nombre,cls.generar_lista(),random.choice(cls._lista_Pokemon),medalla,cls._Gym)
            cls._Gym.setEntrenador(jugador)
            return jugador
        else:
            jugador = Entrenador(nombre,cls.generar_lista(),random.choice(cls._lista_Pokemon),medalla)
            return jugador

    @classmethod
    def crear_rivalRoket(cls):
        cls._Roket.setNombre("james me me mes")
        cls._Roket.setListaPokemon(cls.generar_lista())
        cls._Roket.setPokemonInicial(random.choice(cls._Roket.getListaPokemon))

    @classmethod
    def leer_Entrenadores(cls):
        lista = Deserializador.deserializarTodo()
        return lista



global turno
import tkinter as tk
import tkinter.messagebox as messagebox
from tkinter import ttk
import random


def contrataque():
    global pok2
    global pok1
    global turno
    global labelvp1
    global labelvp2
    habilidad= pok2.getHabilidades()[random.randint(0,2)]
    tk.messagebox.showinfo(message=pok2.getNombre()+" ha respondido con "+habilidad.getNombre()+"\n"+pok1.quitarVida(habilidad.getFuerza()), title="T?tulo")
    labelvp1.config(text=str(pok1.getVida()) + "/" + str(pok1.getVidaMax()), bg="gray")
    labelvp2.config(text=str(pok2.getVida()) + "/" + str(pok2.getVidaMax()), bg="gray")

def btlh1(): #Boton lanzar habilidad
    global turno
    global pok2
    global labelvp1
    global labelvp2
    global h1
    global labelTurno
    global windowbatalla
    turno+=1
    labelTurno['text']=turno
    tk.messagebox.showinfo(message=pok2.quitarVida(h1.getFuerza()), title="T?tulo")
    labelvp1.config(text=str(pok1.getVida()) + "/" + str(pok1.getVidaMax()), bg="gray")
    labelvp2.config(text=str(pok2.getVida()) + "/" + str(pok2.getVidaMax()), bg="gray")
    if pok1.getVida()==0:
        tk.messagebox.showinfo(
            message= pok2.getNombre()+" ha ganado la pelea", title="T?tulo")
        windowbatalla.destroy()
    elif pok2.getVida()==0:
        tk.messagebox.showinfo(
            message=pok1.getNombre() + " ha ganado la pelea", title="T?tulo")
        windowbatalla.destroy()
    else:
        contrataque()
        if pok1.getVida() == 0:
            tk.messagebox.showinfo(
                message=pok2.getNombre() + " ha ganado la pelea", title="T?tulo")
            windowbatalla.destroy()
        elif pok2.getVida() == 0:
            tk.messagebox.showinfo(
                message=pok1.getNombre() + " ha ganado la pelea", title="T?tulo")
            windowbatalla.destroy()

def btlh2(): #Boton lanzar habilidad
    global turno
    global pok2
    global labelvp1
    global labelvp2
    global h2
    global labelTurno
    global windowbatalla
    turno+=1
    labelTurno['text']=turno
    tk.messagebox.showinfo(message=pok2.quitarVida(h2.getFuerza()), title="T?tulo")
    labelvp1.config(text=str(pok1.getVida())+"/"+str(pok1.getVidaMax()), bg="gray")
    labelvp2.config(text=str(pok2.getVida()) + "/" + str(pok2.getVidaMax()), bg="gray")
    if pok1.getVida() == 0:
        tk.messagebox.showinfo(
            message=pok2.getNombre() + " ha ganado la pelea", title="T?tulo")
        windowbatalla.destroy()
    elif pok2.getVida() == 0:
        tk.messagebox.showinfo(
            message=pok1.getNombre() + " ha ganado la pelea", title="T?tulo")
        windowbatalla.destroy()
    else:
        contrataque()
        if pok1.getVida() == 0:
            tk.messagebox.showinfo(
                message=pok2.getNombre() + " ha ganado la pelea", title="T?tulo")
            windowbatalla.destroy()
        elif pok2.getVida() == 0:
            tk.messagebox.showinfo(
                message=pok1.getNombre() + " ha ganado la pelea", title="T?tulo")
            windowbatalla.destroy()


def btlh3(): #Boton lanzar habilidad
    global turno
    global pok2
    global labelvp1
    global labelvp2
    global h3
    global labelTurno
    global windowbatalla
    turno+=1
    labelTurno['text']=turno
    tk.messagebox.showinfo(message=pok2.quitarVida(h3.getFuerza()), title="T?tulo")
    labelvp1.config(text=str(pok1.getVida())+"/"+str(pok1.getVidaMax()), bg="gray")
    labelvp2.config(text=str(pok2.getVida()) + "/" + str(pok2.getVidaMax()), bg="gray")
    if pok1.getVida() == 0:
        tk.messagebox.showinfo(
            message=pok2.getNombre() + " ha ganado la pelea", title="T?tulo")
        windowbatalla.destroy()
    elif pok2.getVida() == 0:
        tk.messagebox.showinfo(
            message=pok1.getNombre() + " ha ganado la pelea", title="T?tulo")
        windowbatalla.destroy()
    else:
        contrataque()
        if pok1.getVida() == 0:
            tk.messagebox.showinfo(
                message=pok2.getNombre() + " ha ganado la pelea", title="T?tulo")
            windowbatalla.destroy()
        elif pok2.getVida() == 0:
            tk.messagebox.showinfo(
                message=pok1.getNombre() + " ha ganado la pelea", title="T?tulo")
            windowbatalla.destroy()



def irBatalla():
    global turno
    global labelTurno
    global h1
    global h2
    global h3
    global labelvp1
    global labelvp2
    global windowbatalla
    if  pok1==None:
        tk.messagebox.showinfo(message="No tienes pokemones para luchar", title="Titulo")
        return

    windowbatalla = tk.Toplevel(app)
    frame = tk.Frame(master=windowbatalla, width=450, height=450, bg="white")
    frame.pack()

    labelnp1 = tk.Label(master=frame, text=pok1.getNombre(), bg="gray")
    labelnp1.place(x=0, y=0)

    labelnp2 = tk.Label(master=frame, text=pok2.getNombre(), bg="gray")
    labelnp2.place(x=380, y=0)

    labelvp1 = tk.Label(master=frame, text=str(pok1.getVida()) + "/" + str(pok1.getVidaMax()), bg="gray")
    labelvp1.place(x=0, y=20)
    labelvp2 = tk.Label(master=frame, text=str(pok2.getVida()) + "/" + str(pok2.getVidaMax()), bg="gray")
    labelvp2.place(x=380, y=20)

    turno = 1
    labelTurno = tk.Label(master=frame, text=turno, bg="gray")
    labelTurno.place(x=200, y=0)
    r = 120

    h1 = pok1.getHabilidades()[0]
    boton1 = tk.Button(master=frame,text=h1.getNombre(), command=btlh1)
    boton1.place(x=0, y=120)

    h2 = pok1.getHabilidades()[1]
    boton1 = tk.Button(master=frame,text=h2.getNombre(), command=btlh2)
    boton1.place(x=0, y=180)

    h3 = pok1.getHabilidades()[2]
    boton1 = tk.Button(master=frame,text=h3.getNombre(), command=btlh3)
    boton1.place(x=0, y=240)

centropokemon= CentroPokemon()
def curarpokemones():
    global centropokemon
    global pok1
    global pok2
    global labelvp2c
    global labelvp1c
    if  pok1==None:
        tk.messagebox.showinfo(message="No tienes pokemones para luchar", title="Titulo")
        return
    pok1.setVida(pok1.getVidaMax())
    pok2.setVida(pok2.getVidaMax())
    tk.messagebox.showinfo(message="Los pokemones se han recuperado!", title="Titulo")
    labelvp1c.config(text=str(pok1.getVida())+"/"+str(pok1.getVidaMax()))

    labelvp2c.config(text=str(pok2.getVida()) + "/" + str(pok2.getVidaMax()))

def ircentropokemon():
    global pok1
    global pok2
    global labelvp2c
    global labelvp1c
    if pok1 == None:
        tk.messagebox.showinfo(message="No tienes pokemones para curar", title="Titulo")
        return
    windowcentropokemon = tk.Toplevel(app)
    frame = tk.Frame(master=windowcentropokemon, width=450, height=450, bg="white")
    frame.pack()

    labelnp1 = tk.Label(master=frame, text=pok1.getNombre(), bg="gray",font=("Arial", 15))
    labelnp1.place(x=0, y=200)

    labelnp2 = tk.Label(master=frame, text=pok2.getNombre(), bg="gray",font=("Arial", 15))
    labelnp2.place(x=340, y=200)

    labelvp1c = tk.Label(master=frame, text=str(pok1.getVida()) + "/" + str(pok1.getVidaMax()), bg="gray",font=("Arial", 15))
    labelvp1c.place(x=0, y=240)

    labelvp2c = tk.Label(master=frame, text=str(pok2.getVida()) + "/" + str(pok2.getVidaMax()), bg="gray",font=("Arial", 15))
    labelvp2c.place(x=340, y=240)


    boton1 = tk.Button(master=frame,text="Curar Pokemones", command=curarpokemones, font=("Arial", 15))
    boton1.place(x=110, y=80)

def envien():
    global pok1
    print(entradanombre.get())
    nombre=entradanombre.get()
    print(combo.get())
    nombrepokemon=combo.get()
    print(combo1.get())
    tk.messagebox.showinfo(message=f"Hola {entradanombre.get()}, hemos creado tu entrenador, Tienes de pokemon principal {combo.get()}", title="Entrenador creado")
    windowcentren.destroy()
    #a
    print("r")
    entrenadori= Entrenador(nombre,Pokemon(nombrepokemon))
    print(combo.get)
    entrenadori.getPokemonInicial()
    s.serializarTodo()

def ircrearentrenador():
    global s
    global pok1
    global pok2
    global labelvp2c
    global labelvp1c
    global lipok

    global entradanombre
    global combo
    global combo1
    global windowcentren
    windowcentren = tk.Toplevel(app)
    frame = tk.Frame(master=windowcentren, width=450, height=450, bg="white")
    frame.pack()

    labelnp1 = tk.Label(master=frame, text="Crear Entrenador", bg="gray", font=("Arial", 15))
    labelnp1.place(x=0, y=40)

    labelnp1 = tk.Label(master=frame, text="Nombre",bg='white',fg='black',font=("Arial", 10))
    labelnp1.place(x=0, y=80)

    entradanombre = tk.Entry(frame,bg='white',fg='black')
    entradanombre.place(x=130, y=80)


    labelnp1 = tk.Label(master=frame, text="Pokemon Principal",bg='white',fg='black', font=("Arial", 10))
    labelnp1.place(x=0, y=120)

    combo = ttk.Combobox(master=frame,values=lipok,state='readonly')
    #combo.bind("<<ComboboxSelected>>") #Evento
    combo.place(x=130, y=120)

    labelnp1 = tk.Label(master=frame, text="Genero", bg='white', fg='black', font=("Arial", 10))
    labelnp1.place(x=0, y=160)

    combo1 = ttk.Combobox(master=frame, values=["M", "F"], state='readonly')
    combo1.place(x=130, y=160)

    botonce= tk.Button(frame, text="Crear", command=envien)
    botonce.place(x=130, y=260)
    pass


def botonee1():
    global pok1
    botonref=0
    pok1=Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial()
    tk.messagebox.showinfo(message=f"Se ha seleccionado {Entrenador.getEntrenadores()[::-1][:5][botonref].getNombre()} con {Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial().getNombre()}", title="pokemon")
    windowelen.destroy()
def botonee2():
    global pok1
    botonref=1
    pok1=Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial()
    tk.messagebox.showinfo(message=f"Se ha seleccionado {Entrenador.getEntrenadores()[::-1][:5][botonref].getNombre()} con {Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial().getNombre()}", title="pokemon")
    windowelen.destroy()
def botonee3():
    global pok1
    botonref=2
    pok1=Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial()
    tk.messagebox.showinfo(message=f"Se ha seleccionado {Entrenador.getEntrenadores()[::-1][:5][botonref].getNombre()} con {Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial().getNombre()}", title="pokemon")
    windowelen.destroy()
def botonee4():
    global pok1
    botonref=3
    pok1=Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial()
    tk.messagebox.showinfo(message=f"Se ha seleccionado {Entrenador.getEntrenadores()[::-1][:5][botonref].getNombre()} con {Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial().getNombre()}", title="pokemon")
    windowelen.destroy()
def botonee5():
    global pok1
    botonref=4
    pok1=Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial()
    tk.messagebox.showinfo(message=f"Se ha seleccionado {Entrenador.getEntrenadores()[::-1][:5][botonref].getNombre()} con {Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial().getNombre()}", title="pokemon")
    windowelen.destroy()
def botonee6():
    global pok1
    botonref=5
    pok1=Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial()
    tk.messagebox.showinfo(message=f"Se ha seleccionado {Entrenador.getEntrenadores()[::-1][:5][botonref].getNombre()} con {Entrenador.getEntrenadores()[::-1][:5][botonref].getPokemonInicial().getNombre()}", title="pokemon")
    windowelen.destroy()

def irelegirentrenador():
    global s
    global pok1
    global pok2
    global labelvp2c
    global labelvp1c
    global lipok
    global botoncin

    global entradanombre
    global combo
    global combo1
    global ds
    global windowelen
    windowelen = tk.Toplevel(app)
    frame = tk.Frame(master=windowelen, width=450, height=450, bg="white")
    frame.pack()

    labelnp1 = tk.Label(master=frame, text="Elegir Entrenador", bg="gray", font=("Arial", 15))
    labelnp1.place(x=0, y=40)

    ds.deserializarTodo()
    r=0
    listabotones=[botonee1,botonee2,botonee3,botonee4,botonee5,botonee6]
    c=0
    for i in Entrenador.getEntrenadores()[::-1][:5]:
        r+=60

        labelnp1 = tk.Label(master=frame, text="Nombre",bg='white',fg='black',font="Arial 12 bold")
        labelnp1.place(x=0, y=20+r)
        labelnp1 = tk.Label(master=frame, text=i.getNombre(),bg='white',fg='black',font=("Arial", 10))
        labelnp1.place(x=100, y=20+r)

        labelnp1 = tk.Label(master=frame, text="Pokemon", bg='white', fg='black', font="Arial 10 bold")
        labelnp1.place(x=5, y=40+r)
        labelnp1 = tk.Label(master=frame, text=i.getPokemonInicial().getNombre(), bg='white', fg='black', font=("Arial", 10))
        labelnp1.place(x=100, y=40+r)
        print(i.getPokemonInicial())

        botoncee1 = tk.Button(frame, text=f"Elegir", command=listabotones[c])
        botoncee1.place(x=180, y=20+r)

        c+=1

    #botoncee1 = tk.Button(frame, text=f"Elegir", command=botonee1)
    #botoncee1.place(x=180, y=20+60)

    #botoncee1 = tk.Button(frame, text=f"Elegir {i.getNombre()}", command=botonee2())
    #botoncee2.place(x=180, y=20+60*2)
    pass


#pok1= Pokemon("Ponyta")
#pok2= Pokemon("Gyarados")
s=Serializador()
ds=Deserializador()
print(Entrenador.getEntrenadores())
lipok=["Pikachu","Electrode","Voltrob","Squirtle","Gyarados","Tentacool","Charmander","Ponyta","Magmar","Gastly","Ekans","Muk","Bulbasur","Gloom","Venusaur"]
pok1=None
#pok1=Pokemon(random.choice(lipok))
pok2=Pokemon(random.choice(lipok))

app = tk.Tk()
frameprincipal = tk.Frame(master=app, width=450, height=450, bg="white")
labelvp1 = tk.Label(master=frameprincipal, text="POOkemon", bg="gray",font=("Arial", 25))
labelvp1.place(x=120, y=20)
frameprincipal.pack()
botonbatalla = tk.Button(master=frameprincipal,text="batalla",command=irBatalla)
botonbatalla.place(x=170, y=200)

botoncentropokemon=tk.Button(master=frameprincipal,text="centro pokemon",command=ircentropokemon)
botoncentropokemon.place(x=146, y=250)

botoncrearpokemon=tk.Button(master=frameprincipal,text="Crear Entrenador",command=ircrearentrenador)
botoncrearpokemon.place(x=146, y=300)


botonelegirEntrenador=tk.Button(master=frameprincipal,text="Elegir Entrenador",command=irelegirentrenador)
botonelegirEntrenador.place(x=146, y=350)

app.mainloop()

##
## Segundaria
##





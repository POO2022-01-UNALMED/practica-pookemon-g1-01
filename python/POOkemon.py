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


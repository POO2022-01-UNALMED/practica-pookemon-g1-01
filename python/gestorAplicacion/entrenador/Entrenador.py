
from gestorAplicacion.pokemon.Pokemon import Pokemon
from gestorAplicacion.pokemon.Habilidad import Habilidad

class Entrenador():

    _entrenadores = []
    
    def __init__(self,Nombre, ListaPokemon,pokemonInicial, Medellas):
        from gestorAplicacion.entrenador.EntrenadorGimnasio import EntrenadorGimnasio
        from gestorAplicacion.entrenador.EntrenadorRoket import EntrenadorRoket
        self._Nombre = Nombre
        self._ListaPokemon = ListaPokemon
        self._pokemonInicial = pokemonInicial
        self._Medellas = Medellas
        if (isinstance(self,EntrenadorGimnasio) == False) and (isinstance(self,EntrenadorRoket) == False):
            Entrenador._entrenadores.append(self)

    def __str__(self):
        return "Nombre: {}\nPokemon Inicial: {}\nMedallas: {}".format(self.getNombre,self.getPokemonInicial,self.getMedallas)

    @classmethod
    def getEntrenadores(cls):
        return cls._entrenadores

    #### getter ####
    def getNombre(self):
        return self._Nombre

    def getListaPokemon(self):
        return self._ListaPokemon
    
    def getPokemonInicial(self):
        return self._pokemonInicial #objeto pokemon
    
    def getMedallas(self):
        return self._Medellas 

    #### setter ####
    def setNombre(self, nuevo):
        self._Nombre = nuevo

    def setListaPokemon(self, nuevo):
        self._ListaPokemon = nuevo
    
    def setPokemonInicial(self, nuevo):
        self._pokemonInicial = nuevo #objeto pokemon
    
    def setMedallas(self, nuevo):
        self._Medellas = nuevo 





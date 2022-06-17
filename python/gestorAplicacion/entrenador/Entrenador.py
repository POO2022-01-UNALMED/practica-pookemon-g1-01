#from pokemon.Pokemon import Pokemon

class Entrenador():
    
    def __init__(self,Nombre, ListaPokemon,pokemonInicial, Medellas):
        self._Nombre = Nombre
        self._ListaPokemon = ListaPokemon
        self._pokemonInicial = pokemonInicial
        self._Medellas = Medellas

    def __str__(self):
        return "hola, mi nombre es {},que tal?".format(self._Nombre)


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





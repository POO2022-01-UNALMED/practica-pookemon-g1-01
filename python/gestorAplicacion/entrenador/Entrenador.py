#from pokemon.Pokemon import Pokemon

class Entrenador():
    
    def __init__(self,Nombre, ListaPokemon,pokemonInicial, Medellas):
        self.Nombre = Nombre
        self.ListaPokemon = ListaPokemon
        self.pokemonInicial = pokemonInicial
        self.Medellas = Medellas

    def __str__(self):
        return "hola, mi nombre es {},que tal?".format(self.Nombre)


    #### getter ####
    def getNombre(self):
        return self.Nombre

    def getListaPokemon(self):
        return self.ListaPokemon
    
    def getPokemonInicial(self):
        return self.pokemonInicial #objeto pokemon
    
    def getMedallas(self):
        return self.Medellas 

    #### setter ####
    def setNombre(self, nuevo):
        self.Nombre = nuevo

    def setListaPokemon(self, nuevo):
        self.ListaPokemon = nuevo
    
    def setPokemonInicial(self, nuevo):
        self.pokemonInicial = nuevo #objeto pokemon
    
    def setMedallas(self, nuevo):
        self.Medellas = nuevo 





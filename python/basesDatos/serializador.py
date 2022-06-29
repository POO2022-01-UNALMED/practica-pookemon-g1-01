import pickle

from gestorAplicacion.entrenador.Entrenador  import Entrenador
from gestorAplicacion.entrenador.EntrenadorGimnasio  import EntrenadorGimnasio
from gestorAplicacion.entrenador.EntrenadorRoket  import EntrenadorRoket
from gestorAplicacion.lugares.Gimnasio  import Gimnasio
from gestorAplicacion.lugares.CentroPokemon import CentroPokemon
from gestorAplicacion.lugares.CampoDeBatalla import CampoDeBatalla
from gestorAplicacion.pokemon.Habilidad import Habilidad
from gestorAplicacion.pokemon.Pokemon import Pokemon

import pathlib
import os

class Serializador():
    
    def serializar(lista, className):
        def camino(className):
            string = os.path.join(pathlib.Path(__file__).parent.absolute(), "temp\\"+className+".txt")
            return string
        try:
            # Creo el archivo pickle para guardar los objetos
            picklefile = open(camino(className), 'wb')
            # pickle el objeto en el archivo
            pickle.dump(lista, picklefile)
            # cierro el archivo para guardar
            picklefile.close()
            
        except:
            print("paila tuqui tuqui muñeco")

    def serializarTodo(cls):

        Serializador.serializar(Entrenador.getEntrenadores(), "Entrenadores")
        Serializador.serializar(EntrenadorGimnasio.getEntrenadoresGym(), "Entrenadores_de_Gym")
        Serializador.serializar(EntrenadorRoket.getEntrenadoresRoket(), "Entrenadores_Roket")
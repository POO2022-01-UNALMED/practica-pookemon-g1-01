

from gestorAplicacion.entrenador.EntrenadorGimnasio import EntrenadorGimnasio


class Gimnasio():

    def __init__(self, nombre, entrenador):
        self._Nombre = nombre
        self._Entrenador = entrenador #objeto EntrnadorGimnasio

    #### getter ####
    def getNombre(self):
        return self._Nombre

    def getEntrenador(self):
        return self._Entrenador.getNombre()

    #### setter ####
    def setNobre(self, nuevo):
        self._Nombre = nuevo
    
    def setEntrenador(self, nuevo):
        self._Entrenador = nuevo




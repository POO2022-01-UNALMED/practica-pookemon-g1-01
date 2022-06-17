from gestorAplicacion.pokemon.Pokemon import Pokemon

class CampoDeBatalla():
    
    _tiempoEspera = 1500
    _turno = 0

    #metodo contructor vacio
    def __init__(self) -> None:
        pass

    """metodos para estructura a la batalla"""

    def resetTurno(self):
        CampoDeBatalla._turno = 1

    def getturno(self):
        return CampoDeBatalla._turno

    def seguirturno(self):
        CampoDeBatalla._turno += 1
    
    def ComenzarBatalla(self, pokemon1, pokemon2):
        accion = input()

    def tespe(self):
        pass        #no se que se hace en este metodo

    def verificarvidas(self, pokemon1, pokemon2):
        if (pokemon1.getVida() == 0) or (pokemon2.getVida() == 0):
            ganador = ""
            if pokemon1.getVida() == 0:
                ganador = pokemon1.getNombre()
            elif pokemon2.getVida() == 0:
                ganador = pokemon2.getNombre()
            return "HA TERMINADO LA PELEA\nEL GANADOR HA SIDO " + ganador
        else:
            return ""



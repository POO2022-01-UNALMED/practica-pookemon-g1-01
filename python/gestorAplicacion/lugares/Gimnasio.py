

from gestorAplicacion.entrenador.EntrenadorGimnasio import EntrenadorGimnasio


class Gimnasio():

    def __init__(self, nombre, entrenador):
        self.Nombre = nombre
        self.Entrenador = entrenador #objeto EntrnadorGimnasio

    #### getter ####
    def getNombre(self):
        return self.Nombre

    def getEntrenador(self):
        return self.Entrenador.getNombre()

    #### setter ####
    def setNobre(self, nuevo):
        self.Nombre = nuevo
    
    def setEntrenador(self, nuevo):
        self.Entrenador = nuevo

E1 = EntrenadorGimnasio("miguel",[1,2,3],1,"unal",None)
Gym = Gimnasio("unal",E1)
E1.setGym(Gym)

print(E1.getGym)
print(Gym.getEntrenador)


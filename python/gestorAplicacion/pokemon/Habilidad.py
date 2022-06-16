

class Habilidad():

    def __init__(self, nombre):
        self.Nombre = nombre
        self.Fuerza = 0
        self.tipo = ""
        self.Debilidades = {}

        #hailidades de agua 
        if self.Nombre == "chapuzon":
            self.tipo = "Agua"
            self.Fuerza = 20
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "agua lodosa":
            self.tipo = "Agua"
            self.Fuerza = 40
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "cascada":
            self.tipo = "Agua"
            self.Fuerza = 30
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "hidrocañon":
            self.tipo = "Agua"
            self.Fuerza = 39
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "hidrobomba":
            self.tipo = "Agua"
            self.Fuerza = 40
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "hidropulzo":
            self.tipo = "Agua"
            self.Fuerza = 60
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "acua jet":
            self.tipo = "Agua"
            self.Fuerza = 50
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "rayo burbuja":
            self.tipo = "Agua"
            self.Fuerza = 45
            self.Debilidades["Electrico"] = 1.5
        if self.Nombre == "salmuera":
            self.tipo = "Agua"
            self.Fuerza = 60
            self.Debilidades["Electrico"] = 1.5

        #HAILIDADES ELECTRICAS
        if self.Nombre == "carga":
            self.tipo = "Electrico"
            self.Fuerza = 40
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "rayo":
            self.tipo = "Electrico"
            self.Fuerza = 25
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "chispa":
            self.tipo = "Electrico"
            self.Fuerza = 60
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "impactrueno":
            self.tipo = "Electrico"
            self.Fuerza = 50
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "puño trueno":
            self.tipo = "Electrico"
            self.Fuerza = 41
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "teco shock":
            self.tipo = "Electrico"
            self.Fuerza = 60
            self.Debilidades["Fuego"] = 1.5

        #HABILIDADES DE FUEGO
        if self.Nombre == "incedio":
            self.tipo = "Fuego"
            self.Fuerza = 20
            self.Debilidades["Agua"] = 1.5
        if self.Nombre == "calor":
            self.tipo = "Fuego"
            self.Fuerza = 38
            self.Debilidades["Agua"] = 1.5
        if self.Nombre == "quemadura":
            self.tipo = "Fuego"
            self.Fuerza = 45
            self.Debilidades["Agua"] = 1.5
        if self.Nombre == "llamarada":
            self.tipo = "Fuego"
            self.Fuerza = 40
            self.Debilidades["Agua"] = 1.5
        if self.Nombre == "anillo igneo":
            self.tipo = "Fuego"
            self.Fuerza = 50
            self.Debilidades["Agua"] = 1.5
        if self.Nombre == "sofoco":
            self.tipo = "Fuego"
            self.Fuerza = 28
            self.Debilidades["Agua"] = 1.5
        if self.Nombre == "lazallamas":
            self.tipo = "Fuego"
            self.Fuerza = 36
            self.Debilidades["Agua"] = 1.5
        
        #HAILIDADES DE PLATA
        if self.Nombre == "hoja afilada":
            self.tipo = "Planta"
            self.Fuerza = 20
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "tormeta floral":
            self.tipo = "Planta"
            self.Fuerza = 45
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "ciclon de hojas":
            self.tipo = "Planta"
            self.Fuerza = 50
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "hiera lazo":
            self.tipo = "Planta"
            self.Fuerza = 58
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "semilladora":
            self.tipo = "Planta"
            self.Fuerza = 60
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "boma germen":
            self.tipo = "Planta"
            self.Fuerza = 49
            self.Debilidades["Fuego"] = 1.5
        if self.Nombre == "latigo cepa":
            self.tipo = "Planta"
            self.Fuerza = 100
            self.Debilidades["Fuego"] = 1.5
        
        #HAILIDADES DE VENENO
        if self.Nombre == "acido":
            self.tipo = "Venenoso"
            self.Fuerza = 45
            self.Debilidades["Planta"] = 1.5
        if self.Nombre == "bomba lodo":
            self.tipo = "Venenoso"
            self.Fuerza = 50
            self.Debilidades["Planta"] = 1.5
        if self.Nombre == "lanzamugre":
            self.tipo = "Venenoso"
            self.Fuerza = 49
            self.Debilidades["Planta"] = 1.5
        if self.Nombre == "puya nociva":
            self.tipo = "Venenoso"
            self.Fuerza = 20
            self.Debilidades["Planta"] = 1.5
        if self.Nombre == "venenon X":
            self.tipo = "Venenoso"
            self.Fuerza = 39
            self.Debilidades["Planta"] = 1.5
        if self.Nombre == "Veneno Y":
            self.tipo = "Venenoso"
            self.Fuerza = 50
            self.Debilidades["Planta"] = 1.5
        if self.Nombre == "bomba acida":
            self.tipo = "Venenoso"
            self.Fuerza = 28
            self.Debilidades["Planta"] = 1.5
    
    """metodos get y set y metodo toStrig"""
    def __str__(self) -> str:
        return self.Nombre
    
    def getFuerza(self):
        return self.Fuerza
    
    def getDebilidad(self, r):
        if self.Debilidades[r] == None:
            return 1
        else:
            return self.Debilidades[r]
    
    def getNombre(self):
        return self.Nombre
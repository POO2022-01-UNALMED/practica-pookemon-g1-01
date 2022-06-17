

class Habilidad():

    def __init__(self, nombre):
        self._Nombre = nombre
        self._Fuerza = 0
        self._tipo = ""
        self._Debilidades = {}

        #hailidades de agua 
        if self._Nombre == "chapuzon":
            self._tipo = "Agua"
            self._Fuerza = 20
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "agua lodosa":
            self._tipo = "Agua"
            self._Fuerza = 40
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "cascada":
            self._tipo = "Agua"
            self._Fuerza = 30
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "hidrocañon":
            self._tipo = "Agua"
            self._Fuerza = 39
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "hidrobomba":
            self._tipo = "Agua"
            self._Fuerza = 40
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "hidropulzo":
            self._tipo = "Agua"
            self._Fuerza = 60
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "acua jet":
            self._tipo = "Agua"
            self._Fuerza = 50
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "rayo burbuja":
            self._tipo = "Agua"
            self._Fuerza = 45
            self._Debilidades["Electrico"] = 1.5
        if self._Nombre == "salmuera":
            self._tipo = "Agua"
            self._Fuerza = 60
            self._Debilidades["Electrico"] = 1.5

        #HAILIDADES ELECTRICAS
        if self._Nombre == "carga":
            self._tipo = "Electrico"
            self._Fuerza = 40
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "rayo":
            self._tipo = "Electrico"
            self._Fuerza = 25
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "chispa":
            self._tipo = "Electrico"
            self._Fuerza = 60
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "impactrueno":
            self._tipo = "Electrico"
            self._Fuerza = 50
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "puño trueno":
            self._tipo = "Electrico"
            self._Fuerza = 41
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "teco shock":
            self._tipo = "Electrico"
            self._Fuerza = 60
            self._Debilidades["Fuego"] = 1.5

        #HABILIDADES DE FUEGO
        if self._Nombre == "incedio":
            self._tipo = "Fuego"
            self._Fuerza = 20
            self._Debilidades["Agua"] = 1.5
        if self._Nombre == "calor":
            self._tipo = "Fuego"
            self._Fuerza = 38
            self._Debilidades["Agua"] = 1.5
        if self._Nombre == "quemadura":
            self._tipo = "Fuego"
            self._Fuerza = 45
            self._Debilidades["Agua"] = 1.5
        if self._Nombre == "llamarada":
            self._tipo = "Fuego"
            self._Fuerza = 40
            self._Debilidades["Agua"] = 1.5
        if self._Nombre == "anillo igneo":
            self._tipo = "Fuego"
            self._Fuerza = 50
            self._Debilidades["Agua"] = 1.5
        if self._Nombre == "sofoco":
            self._tipo = "Fuego"
            self._Fuerza = 28
            self._Debilidades["Agua"] = 1.5
        if self._Nombre == "lazallamas":
            self._tipo = "Fuego"
            self._Fuerza = 36
            self._Debilidades["Agua"] = 1.5
        
        #HAILIDADES DE PLATA
        if self._Nombre == "hoja afilada":
            self._tipo = "Planta"
            self._Fuerza = 20
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "tormeta floral":
            self._tipo = "Planta"
            self._Fuerza = 45
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "ciclon de hojas":
            self._tipo = "Planta"
            self._Fuerza = 50
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "hiera lazo":
            self._tipo = "Planta"
            self._Fuerza = 58
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "semilladora":
            self._tipo = "Planta"
            self._Fuerza = 60
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "boma germen":
            self._tipo = "Planta"
            self._Fuerza = 49
            self._Debilidades["Fuego"] = 1.5
        if self._Nombre == "latigo cepa":
            self._tipo = "Planta"
            self._Fuerza = 100
            self._Debilidades["Fuego"] = 1.5
        
        #HAILIDADES DE VENENO
        if self._Nombre == "acido":
            self._tipo = "Venenoso"
            self._Fuerza = 45
            self._Debilidades["Planta"] = 1.5
        if self._Nombre == "bomba lodo":
            self._tipo = "Venenoso"
            self._Fuerza = 50
            self._Debilidades["Planta"] = 1.5
        if self._Nombre == "lanzamugre":
            self._tipo = "Venenoso"
            self._Fuerza = 49
            self._Debilidades["Planta"] = 1.5
        if self._Nombre == "puya nociva":
            self._tipo = "Venenoso"
            self._Fuerza = 20
            self._Debilidades["Planta"] = 1.5
        if self._Nombre == "venenon X":
            self._tipo = "Venenoso"
            self._Fuerza = 39
            self._Debilidades["Planta"] = 1.5
        if self._Nombre == "Veneno Y":
            self._tipo = "Venenoso"
            self._Fuerza = 50
            self._Debilidades["Planta"] = 1.5
        if self._Nombre == "bomba acida":
            self._tipo = "Venenoso"
            self._Fuerza = 28
            self._Debilidades["Planta"] = 1.5
    
    """metodos get y set y metodo toStrig"""
    def __str__(self) -> str:
        return self._Nombre
    
    def getFuerza(self):
        return self._Fuerza
    
    def getDebilidad(self, r):
        if self._Debilidades[r] == None:
            return 1
        else:
            return self._Debilidades[r]
    
    def getNombre(self):
        return self._Nombre
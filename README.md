# Pasos para descargar librerías de spring

-Ir a https://repo.spring.io/ui/packages

-Una vez dentro, acceder a Artifactory > Artifacts > libs-release > org > springframework > spring > versión deseada > click en el dist.zip > click en url to file

-Descomprimir archivo comprimido

-Crear carpeta lib en el proyecto, al mismo nivel que src

-Pegar todos los jar ahí

# Pasos para configurarlo en el proyecto

-Click derecho en el Java Project

-Entrar en Properties > java Build Path y hacer click en la pestaña libraries

-Seleccionar Classpath y hacer click en Add Jars

-Seleccionar todos los jar de la carpeta lib de nuestro Java Project y hacer click en aplicar
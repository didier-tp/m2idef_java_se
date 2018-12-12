file / new / project ... / Maven / Maven project
* cocher "create a simple project (skip archetype selection)"
* groupId = "com.m2i.tp" , artifctId = nomDuNouveauProjet
* après avoir retoucher pom.xml , menu "maven / update project"

mvn install
permet de construire l'application (compilation, test , .jar )

mvn javadoc:javadoc 
ou bien run as / maven build ... et goal= javadoc:javadoc
permet de générer la javadoc dans le répertoire target/site/apidocs
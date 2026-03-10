class TV{
  int polegadas=45;
  int volume=5;
  int canal;
  int voltagem=110;
  String marca;

  void ligar (){
   int consumo= voltagem * polegadas
    printf ("O consumo é igual a %d%n", consumo);
  }
 int aumentarVolume (){
    if (volume<10){
      volume++;
    return volume; 
    }

    int diminuirVolume() {
    if (volume > 1) {
        volume--;
       return volume;
  
}
      int subirCanal() {
    canal++;
    System.out.printf("Mudou para o canal: %d%n", canal);
    return canal;
}

    int descerCanal() {
    if (canal > 1) {
        canal--;
        printf("Mudou para o canal: %d%n", canal);
    return canal;
}

//A televisão pode realizar as seguintes ações:

desligar;
aumentar e diminuir o volume;
subir e descer canal.

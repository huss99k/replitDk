public class TV{
  //implement the class

  private int channel;
  private int volume;
  private boolean isOn;

   public boolean getTV(){
     return isOn;
   }

  public int getChannel(){
    return channel;
  }
  public int getVolume(){
    return volume;
  }


  public TV(){
    isOn = false;
    channel = 1;
    volume = 1;    
  }

  public TV(int channel,int volume){
    this.channel= channel;
    this.volume = volume;    
  }
    public void turnOn(){
      isOn =  true;
    }

    public void turnOff(){
      isOn =  false;
    }
   public void setChannel(int newChannel){
      this.channel = newChannel;
    }

   public void setVolume(int newVolume){
      this.volume = newVolume;
    }

  public void channelUp(){
    if(isOn == true & channel < 120)
        channel += 1;
  }

    public void channelDown(){
    if(isOn == true & channel > 1)
        channel -= 1;
  }

   public void volumeDown(){
    if(isOn == true & volume > 1)
        volume -= 1;
  }

   public void volumeUp(){
    if(isOn == true & volume < 120)
        volume += 1;
  }




  
  
}
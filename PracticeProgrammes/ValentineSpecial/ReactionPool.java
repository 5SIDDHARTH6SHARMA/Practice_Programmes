package ValentineSpecial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReactionPool {
  static List<String> reactions = new ArrayList<>(Arrays.asList(
      "Oh? Ohhh? Should I start planning the wedding or chill?",
      "Hold up, did I just win? No way, say it again.",
      "Ahem… I need a moment to process this.",
      "You're playing with my heart here, and it's working.",
      "Stop, I can't handle this much cuteness at once.",
      "Wait, did you just admit something? I need a screenshot.",
      "Are you blushing? I feel like you're blushing.",
      "No take-backs. I'm holding onto this forever.",
      "My heart just did a triple backflip, thanks.",
      "Okay okay, stay calm, don't simp too hard… too late.",
      "I KNEW IT! Victory tastes so sweet.",
      "If you keep saying things like that, I might actually melt.",
      "Whew, is it hot in here or did you just turn up the heat?",
      "Deny it all you want, I can see right through you.",
      "You saying that just added five years to my lifespan.",
      "Wait, did I just make you flustered? My job here is done.",
      "I'm smiling way too hard at my screen right now.",
      "Be careful, I might start thinking you actually like me.",
      "You're making it really hard for me to stop flirting, y'know.",
      "Oh wow, my heart just skipped like five beats."));

  public static String getReactions(int index) {
    return reactions.get(index);
  }
}

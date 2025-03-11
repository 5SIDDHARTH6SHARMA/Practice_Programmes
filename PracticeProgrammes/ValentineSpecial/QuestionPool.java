package ValentineSpecial;

import java.util.List;
import java.util.ArrayList;

public class QuestionPool {
  List<List<String>> questions = new ArrayList<>();

  public QuestionPool() {
    questions.add(List.of(
        "So, be honest... How much do you like talking to me?",
        "Ugh, why are you even making me admit this?",
        "Let's just say... I don't hate it.",
        "I tolerate you... but only because you make me laugh.",
        "If I say 'a little,' will you stop being so smug?",
        "Fine, okay! I kinda look forward to it, happy now?",
        "What if I secretly love it? Not saying I do… but what if?"));

    questions.add(List.of(
        "If we were in a rom-com, what would our story be?",
        "Enemies to lovers—but I'm still in the denial phase.",
        "Best friends... until one of us slips up and confesses. Oops.",
        "The 'fake dating' trope—except one of us actually falls.",
        "That slow-burn romance where everyone sees it but us.",
        "Love at first sight... wait, did I just say that out loud?",
        "No rom-com, just me roasting you every day for fun."));

    questions.add(List.of(
        "If I wanted to impress you, what should I do?",
        "Try, but fail, because I refuse to be impressed.",
        "Buy me food. Simple, effective, and foolproof.",
        "Send me cute good morning texts. Maybe.",
        "Make me laugh until I forget I was pretending not to like you.",
        "Write me a cheesy pickup line so bad I secretly love it.",
        "Just be yourself... but like, extra charming. No pressure."));

    questions.add(List.of(
        "What would happen if I called you 'mine' right now?",
        "I'd pretend I didn't see it and keep scrolling.",
        "You'd hear crickets because I'd be too stunned to reply.",
        "I'd roll my eyes but secretly blush. Maybe.",
        "I'd say 'in your dreams' but then overthink it for hours.",
        "I'd challenge you to actually prove it. Good luck.",
        "I'd say 'okay' just to mess with you... or would I?"));

    questions.add(List.of(
        "If I asked you on a Valentine's date, what would you say?",
        "'LOL, good one.' But lowkey considers it.",
        "'Only if food is involved.'",
        "'As if I'd say yes that easily.'",
        "'Hmm, let me check my very busy schedule…' refreshes empty calendar",
        "'Depends. Are you gonna be charming or annoying?'",
        "'Fine, but if I start catching feelings, it's YOUR fault.'"));

    questions.add(List.of(
        "What's stopping you from just falling for me already?",
        "My stubbornness. I refuse to lose this game.",
        "Who said I haven't? Nervous laughter.",
        "You're too flirty, and I can't trust myself around that.",
        "I'm still pretending not to like you. It's a process.",
        "You haven't bribed me with snacks yet.",
        "Honestly? Nothing. But I'll never admit it."));
  }

  public List<String> getQuestion(int index) {
    return questions.get(index);
  }
}

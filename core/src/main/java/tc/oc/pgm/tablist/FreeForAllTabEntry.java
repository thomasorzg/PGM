package tc.oc.pgm.tablist;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import tc.oc.pgm.api.match.Match;
import tc.oc.util.bukkit.component.types.PersonalizedText;
import tc.oc.util.bukkit.component.types.PersonalizedTranslatable;
import tc.oc.util.bukkit.tablist.DynamicTabEntry;
import tc.oc.util.bukkit.tablist.TabView;

public class FreeForAllTabEntry extends DynamicTabEntry {

  private final Match match;

  public FreeForAllTabEntry(Match match) {
    this.match = match;
  }

  @Override
  public BaseComponent getContent(TabView view) {
    return new PersonalizedText(
            new PersonalizedText(String.valueOf(match.getParticipants().size()), ChatColor.WHITE),
            new PersonalizedText("/", ChatColor.DARK_GRAY),
            new PersonalizedText(String.valueOf(match.getMaxPlayers()), ChatColor.GRAY),
            new PersonalizedText(" ", ChatColor.YELLOW, ChatColor.BOLD)
                .extra(new PersonalizedTranslatable("command.match.matchInfo.players")))
        .render(view.getViewer());
  }
}

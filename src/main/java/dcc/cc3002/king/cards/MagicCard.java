package dcc.cc3002.king.cards;

import dcc.cc3002.king.PlayerMat;
import java.util.Objects;

/**
 * Class that represents a magic card in the game.
 *
 * @author Ignacio Slater Muñoz
 */
public class MagicCard implements ICard {

  private final String name;

  public MagicCard(final String name) {
    this.name = name;
  }

  @Override
  public void playTo(final PlayerMat playerMat) {
    playerMat.addMagicCard(this);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, MagicCard.class);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MagicCard)) {
      return false;
    }
    final MagicCard magicCard = (MagicCard) o;
    return name.equals(magicCard.name);
  }
}

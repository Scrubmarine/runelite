package net.runelite.client.plugins.slayer;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;

import javax.annotation.Nullable;
import java.util.Map;
@Getter
enum Superior {
     CRAWLING_HANDS("Crawling hands", "Crushing hand"),
     CAVE_CRAWLER("Cave crawler", "Chasm Crawler"),
     BANSHEE("Banshee", "Screaming banshee"),
     TWISTED_BANSHEE("Twisted Banshee", "Screaming twisted banshee"),
     ROCK_SLUG("Rock slug", "Giant rockslug"),
     COCKATRICE("Cockatrice", "Cockathrice"),
     PYREFIEND("Pyrefiend", "Flaming pyrelord"),
     PYRELORD("Pyrelord", "Infernal pyrelord"),
     BASILISK("Basilisk", "Monstrous basilisk"),
     INFERNAL_MAGE("Infernal Mage", "Malevolent Mage"),
     BLOODVELD("Bloodveld", "Insatiable Bloodveld"),
     MUTATED_BLOODVELD("Mutated Bloodveld", "Insatiable mutated Bloodveld"),
     JELLY("Jelly", "Vitreous Jelly"),
     WARPED_JELLY("Warped Jelly", "Vitreous warped Jelly"),
     TUROTH("Turoth", "Spiked Turoth"),
     WARPED_TERRORBIRD("Warped Terrorbird", "Mutated Terrorbird"),
     WARPED_TORTOISE("Warped Tortoise", "Mutated Tortoise"),
     CAVE_HORROR("Cave horror", "Cave abomination"),
     ABERRANT_SPECTRE("Aberrant spectre", "Abhorrent spectre"),
     DEVIANT_SPECTRE("Deviant spectre", "Repugnant spectre"),
     BASILISK_KNIGHT("Basilisk Knight", "Basilisk Sentinel"),
     WYRM("Wyrm", "Shadow Wyrm"),
     DUST_DEVIL("Dust devil", "Choke devil"),
     KURASK("Kurask", "King kurask"),
     GARGOYLE("Gargoyle", "Marble gargoyle"),
     NECHRYAEL("Nechryael", "Nechryarch"),
     GREATER_NECHRYAEL("Greater Nechryael", "Nechryarch"),
     DRAKE("Drake", "Guardian Drake"),
     ABYSSAL_DEMON("Abyssal demon", "Greater abyssal demon"),
     DARK_BEAST("Dark beast", "Night beast"),
     ARAXYTE("Araxyte", "Dreadborn Araxyte"),
     SMOKE_DEVIL("Smoke devil", "Nuclear smoke devil"),
     HYDRA("Hydra", "Colossal Hydra");

    private static final Map<String, Superior> superiors;
    private final String name;
    private final String superiorVariant;

    static
    {
        ImmutableMap.Builder<String, Superior> builder = new ImmutableMap.Builder<>();

        for (Superior superior : values())
        {
            builder.put(superior.getName().toLowerCase(), superior);
        }

        superiors = builder.build();
    }
    Superior(String name, String superiorVariant) {
        this.name = name;
        this.superiorVariant = superiorVariant;
    }


    @Nullable
    static Superior getSuperior(String name)
    {
        return superiors.get(name.toLowerCase());
    }
}
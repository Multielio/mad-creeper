package fr.polielio.mc;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class Takedamage implements Listener {

    @EventHandler
    public void taked(EntityDamageByEntityEvent e) {
        if(!(e.getEntity() instanceof Player))return;
        if((!(e.getDamager() instanceof Creeper)) && (!( e.getCause() == EntityDamageEvent.DamageCause.ENTITY_EXPLOSION)))return;
        e.setCancelled(true);
        Player p = (Player) e.getEntity();
        p.setHealth(0);
        p.sendMessage("§c You have been instant kill by a creeper !");
    }

    @EventHandler
    public void taked(EntitySpawnEvent e) {
        if(!(e.getEntity() instanceof Creeper))return;
        ((Creeper) e.getEntity()).addPotionEffect(new PotionEffect(PotionEffectType.SPEED,600000,2));
    }
}



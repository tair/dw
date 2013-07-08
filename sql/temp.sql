select l.species_variant_id, count(*) from Locus l JOIN MapElement m ON l.map_element_id = m.map_element_id where l.taxon_id = 1 and l.is_obsolete = 'F' group by l.species_variant_id;

select * from SpeciesVariant where species_variant_id = 89;

select species_variant_id, name from Locus where taxon_id = 1 and is_obsolete = 'F' and species_variant_id is null;

select name from Contig;

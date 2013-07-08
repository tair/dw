SELECT DISTINCT 
       p.polymorphism_id AS id, 
       p.name AS name, 
       p.tair_object_id AS tair_object_id,
       p.type AS type, 
       p.chromosome AS chromosome, 
       p.map_element_id AS map_element_id,
       p.is_allele AS is_allele, 
       null AS position_requested, 
       ' ' AS units_requested,
       'none' AS map_type_requested
  FROM Polymorphism p JOIN 
       Polymorphism p1 ON p.polymorphism_id = p1.ref_polymorphism_id JOIN 
       MapElement_Locus mel ON p1.map_element_id = mel.map_element_id
 WHERE p.is_obsolete = 'F' AND
       mel.locus_id IN (
         SELECT locus_id 
           FROM LocusNameAlias 
          WHERE name like 'AT2G32950' ) AND
       p1.polymorphism_id IN (
         SELECT ids.polymorphism_id 
           FROM (SELECT HP.polymorphism_id
                   FROM Polymorphism LP JOIN
                        Polymorphism_SpeciesVariant LPS ON LP.polymorphism_id = LPS.polymorphism_id JOIN
                        SpeciesVariant LSV ON LPS.species_variant_id = LSV.species_variant_id JOIN
                        Polymorphism HP ON HP.polymorphism_id = HPS.polymorphism_id AND 
                                           HP.ref_polymorphism_id = LP.ref_polymorphism_id AND 
                                           HP.polymorphism_id != LP.polymorphism_id JOIN
                        SpeciesVariant HSV
                        Polymorphism_SpeciesVariant HPS ON HPS.species_variant_id = HSV.species_variant_id JOIN
                  WHERE LSV.name = 'CAPE VERDI ISLANDS' AND
                        HSV.name = 'COLUMBIA'
                ) AND
                 AND
                
                UNION
                select LP.polymorphism_id
                From Polymorphism LP,Polymorphism_SpeciesVariant LPS, SpeciesVariant LSV ,
                Polymorphism HP,Polymorphism_SpeciesVariant HPS, SpeciesVariant HSV
                WHERE (
                    ( LP.polymorphism_id = LPS.polymorphism_id AND
                      LPS.species_variant_id = LSV.species_variant_id AND
                      LSV.name = 'CAPE VERDI ISLANDS') AND
                    ( HP.polymorphism_id = HPS.polymorphism_id AND
                      HPS.species_variant_id = HSV.species_variant_id AND
                      HSV.name = 'COLUMBIA')
                ) AND
                HP.ref_polymorphism_id = LP.ref_polymorphism_id AND
                HP.polymorphism_id != LP.polymorphism_id ) as ids )
ORDER BY name 
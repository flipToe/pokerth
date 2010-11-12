
package pokerth_protocol;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "DealTurnCardMessage" )
    public class DealTurnCardMessage implements IASN1PreparedElement {
                
        

       @ASN1PreparedElement
       @ASN1Sequence ( name = "DealTurnCardMessage" , isSet = false )
       public static class DealTurnCardMessageSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "gameId", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private NonZeroId gameId = null;
                
  
        @ASN1Element ( name = "turnCard", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
	private Card turnCard = null;
                
  
        
        public NonZeroId getGameId () {
            return this.gameId;
        }

        

        public void setGameId (NonZeroId value) {
            this.gameId = value;
        }
        
  
        
        public Card getTurnCard () {
            return this.turnCard;
        }

        

        public void setTurnCard (Card value) {
            this.turnCard = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_DealTurnCardMessageSequenceType;
        }

       private static IASN1PreparedElementData preparedData_DealTurnCardMessageSequenceType = CoderFactory.getInstance().newPreparedElementData(DealTurnCardMessageSequenceType.class);
                
       }

       
                
        @ASN1Element ( name = "DealTurnCardMessage", isOptional =  false , hasTag =  true, tag = 29, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private DealTurnCardMessageSequenceType  value;        

        
        
        public DealTurnCardMessage () {
        }
        
        
        
        public void setValue(DealTurnCardMessageSequenceType value) {
            this.value = value;
        }
        
        
        
        public DealTurnCardMessageSequenceType getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(DealTurnCardMessage.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            
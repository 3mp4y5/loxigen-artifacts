// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmBsnVxlanNetworkIdVer14 implements OFOxmBsnVxlanNetworkId {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnVxlanNetworkIdVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static VxlanNI DEFAULT_VALUE = VxlanNI.ZERO;

    // OF message fields
    private final VxlanNI value;
//
    // Immutable default instance
    final static OFOxmBsnVxlanNetworkIdVer14 DEFAULT = new OFOxmBsnVxlanNetworkIdVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnVxlanNetworkIdVer14(VxlanNI value) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnVxlanNetworkIdVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x32a04L;
    }

    @Override
    public VxlanNI getValue() {
        return value;
    }

    @Override
    public MatchField<VxlanNI> getMatchField() {
        return MatchField.BSN_VXLAN_NETWORK_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<VxlanNI> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public VxlanNI getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmBsnVxlanNetworkId.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnVxlanNetworkId.Builder {
        final OFOxmBsnVxlanNetworkIdVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private VxlanNI value;

        BuilderWithParent(OFOxmBsnVxlanNetworkIdVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x32a04L;
    }

    @Override
    public VxlanNI getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVxlanNetworkId.Builder setValue(VxlanNI value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<VxlanNI> getMatchField() {
        return MatchField.BSN_VXLAN_NETWORK_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<VxlanNI> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public VxlanNI getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmBsnVxlanNetworkId build() {
                VxlanNI value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnVxlanNetworkIdVer14(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnVxlanNetworkId.Builder {
        // OF message fields
        private boolean valueSet;
        private VxlanNI value;

    @Override
    public long getTypeLen() {
        return 0x32a04L;
    }

    @Override
    public VxlanNI getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVxlanNetworkId.Builder setValue(VxlanNI value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<VxlanNI> getMatchField() {
        return MatchField.BSN_VXLAN_NETWORK_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<VxlanNI> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public VxlanNI getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmBsnVxlanNetworkId build() {
            VxlanNI value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnVxlanNetworkIdVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnVxlanNetworkId> {
        @Override
        public OFOxmBsnVxlanNetworkId readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x32a04L
            int typeLen = bb.readInt();
            if(typeLen != 0x32a04)
                throw new OFParseError("Wrong typeLen: Expected=0x32a04L(0x32a04L), got="+typeLen);
            VxlanNI value = VxlanNI.read4Bytes(bb);

            OFOxmBsnVxlanNetworkIdVer14 oxmBsnVxlanNetworkIdVer14 = new OFOxmBsnVxlanNetworkIdVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnVxlanNetworkIdVer14);
            return oxmBsnVxlanNetworkIdVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnVxlanNetworkIdVer14Funnel FUNNEL = new OFOxmBsnVxlanNetworkIdVer14Funnel();
    static class OFOxmBsnVxlanNetworkIdVer14Funnel implements Funnel<OFOxmBsnVxlanNetworkIdVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnVxlanNetworkIdVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x32a04L
            sink.putInt(0x32a04);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnVxlanNetworkIdVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnVxlanNetworkIdVer14 message) {
            // fixed value property typeLen = 0x32a04L
            bb.writeInt(0x32a04);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnVxlanNetworkIdVer14(");
        b.append("value=").append(value);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFOxmBsnVxlanNetworkIdVer14 other = (OFOxmBsnVxlanNetworkIdVer14) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}

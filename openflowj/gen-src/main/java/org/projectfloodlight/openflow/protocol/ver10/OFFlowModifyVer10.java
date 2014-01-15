// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFFlowModifyVer10 implements OFFlowModify {
    private static final Logger logger = LoggerFactory.getLogger(OFFlowModifyVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 72;

        private final static long DEFAULT_XID = 0x0L;
        private final static Match DEFAULT_MATCH = OFFactoryVer10.MATCH_WILDCARD_ALL;
        private final static U64 DEFAULT_COOKIE = U64.ZERO;
        private final static int DEFAULT_IDLE_TIMEOUT = 0x0;
        private final static int DEFAULT_HARD_TIMEOUT = 0x0;
        private final static int DEFAULT_PRIORITY = 0x0;
        private final static OFBufferId DEFAULT_BUFFER_ID = OFBufferId.NO_BUFFER;
        private final static OFPort DEFAULT_OUT_PORT = OFPort.ANY;
        private final static Set<OFFlowModFlags> DEFAULT_FLAGS = ImmutableSet.<OFFlowModFlags>of();
        private final static List<OFAction> DEFAULT_ACTIONS = ImmutableList.<OFAction>of();

    // OF message fields
    private final long xid;
    private final Match match;
    private final U64 cookie;
    private final int idleTimeout;
    private final int hardTimeout;
    private final int priority;
    private final OFBufferId bufferId;
    private final OFPort outPort;
    private final Set<OFFlowModFlags> flags;
    private final List<OFAction> actions;
//
    // Immutable default instance
    final static OFFlowModifyVer10 DEFAULT = new OFFlowModifyVer10(
        DEFAULT_XID, DEFAULT_MATCH, DEFAULT_COOKIE, DEFAULT_IDLE_TIMEOUT, DEFAULT_HARD_TIMEOUT, DEFAULT_PRIORITY, DEFAULT_BUFFER_ID, DEFAULT_OUT_PORT, DEFAULT_FLAGS, DEFAULT_ACTIONS
    );

    // package private constructor - used by readers, builders, and factory
    OFFlowModifyVer10(long xid, Match match, U64 cookie, int idleTimeout, int hardTimeout, int priority, OFBufferId bufferId, OFPort outPort, Set<OFFlowModFlags> flags, List<OFAction> actions) {
        this.xid = xid;
        this.match = match;
        this.cookie = cookie;
        this.idleTimeout = idleTimeout;
        this.hardTimeout = hardTimeout;
        this.priority = priority;
        this.bufferId = bufferId;
        this.outPort = outPort;
        this.flags = flags;
        this.actions = actions;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.FLOW_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public U64 getCookieMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookieMask not supported in version 1.0");
    }

    @Override
    public TableId getTableId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }

    @Override
    public OFFlowModCommand getCommand() {
        return OFFlowModCommand.MODIFY;
    }

    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public OFPort getOutPort() {
        return outPort;
    }

    @Override
    public long getOutGroup()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property outGroup not supported in version 1.0");
    }

    @Override
    public Set<OFFlowModFlags> getFlags() {
        return flags;
    }

    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public List<OFInstruction> getInstructions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }



    public OFFlowModify.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFFlowModify.Builder {
        final OFFlowModifyVer10 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean matchSet;
        private Match match;
        private boolean cookieSet;
        private U64 cookie;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean prioritySet;
        private int priority;
        private boolean bufferIdSet;
        private OFBufferId bufferId;
        private boolean outPortSet;
        private OFPort outPort;
        private boolean flagsSet;
        private Set<OFFlowModFlags> flags;
        private boolean actionsSet;
        private List<OFAction> actions;

        BuilderWithParent(OFFlowModifyVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.FLOW_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFlowModify.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFFlowModify.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getCookieMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookieMask not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setCookieMask(U64 cookieMask) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property cookieMask not supported in version 1.0");
    }
    @Override
    public TableId getTableId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setTableId(TableId tableId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }
    @Override
    public OFFlowModCommand getCommand() {
        return OFFlowModCommand.MODIFY;
    }

    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFFlowModify.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFFlowModify.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowModify.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public OFFlowModify.Builder setBufferId(OFBufferId bufferId) {
        this.bufferId = bufferId;
        this.bufferIdSet = true;
        return this;
    }
    @Override
    public OFPort getOutPort() {
        return outPort;
    }

    @Override
    public OFFlowModify.Builder setOutPort(OFPort outPort) {
        this.outPort = outPort;
        this.outPortSet = true;
        return this;
    }
    @Override
    public long getOutGroup()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property outGroup not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setOutGroup(long outGroup) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property outGroup not supported in version 1.0");
    }
    @Override
    public Set<OFFlowModFlags> getFlags() {
        return flags;
    }

    @Override
    public OFFlowModify.Builder setFlags(Set<OFFlowModFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowModify.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public List<OFInstruction> getInstructions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setInstructions(List<OFInstruction> instructions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFFlowModify.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }


        @Override
        public OFFlowModify build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Match match = this.matchSet ? this.match : parentMessage.match;
                if(match == null)
                    throw new NullPointerException("Property match must not be null");
                U64 cookie = this.cookieSet ? this.cookie : parentMessage.cookie;
                if(cookie == null)
                    throw new NullPointerException("Property cookie must not be null");
                int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : parentMessage.idleTimeout;
                int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : parentMessage.hardTimeout;
                int priority = this.prioritySet ? this.priority : parentMessage.priority;
                OFBufferId bufferId = this.bufferIdSet ? this.bufferId : parentMessage.bufferId;
                if(bufferId == null)
                    throw new NullPointerException("Property bufferId must not be null");
                OFPort outPort = this.outPortSet ? this.outPort : parentMessage.outPort;
                if(outPort == null)
                    throw new NullPointerException("Property outPort must not be null");
                Set<OFFlowModFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                List<OFAction> actions = this.actionsSet ? this.actions : parentMessage.actions;
                if(actions == null)
                    throw new NullPointerException("Property actions must not be null");

                //
                return new OFFlowModifyVer10(
                    xid,
                    match,
                    cookie,
                    idleTimeout,
                    hardTimeout,
                    priority,
                    bufferId,
                    outPort,
                    flags,
                    actions
                );
        }

    }

    static class Builder implements OFFlowModify.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean matchSet;
        private Match match;
        private boolean cookieSet;
        private U64 cookie;
        private boolean idleTimeoutSet;
        private int idleTimeout;
        private boolean hardTimeoutSet;
        private int hardTimeout;
        private boolean prioritySet;
        private int priority;
        private boolean bufferIdSet;
        private OFBufferId bufferId;
        private boolean outPortSet;
        private OFPort outPort;
        private boolean flagsSet;
        private Set<OFFlowModFlags> flags;
        private boolean actionsSet;
        private List<OFAction> actions;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.FLOW_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFFlowModify.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public U64 getCookie() {
        return cookie;
    }

    @Override
    public OFFlowModify.Builder setCookie(U64 cookie) {
        this.cookie = cookie;
        this.cookieSet = true;
        return this;
    }
    @Override
    public U64 getCookieMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property cookieMask not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setCookieMask(U64 cookieMask) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property cookieMask not supported in version 1.0");
    }
    @Override
    public TableId getTableId()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setTableId(TableId tableId) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property tableId not supported in version 1.0");
    }
    @Override
    public OFFlowModCommand getCommand() {
        return OFFlowModCommand.MODIFY;
    }

    @Override
    public int getIdleTimeout() {
        return idleTimeout;
    }

    @Override
    public OFFlowModify.Builder setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
        this.idleTimeoutSet = true;
        return this;
    }
    @Override
    public int getHardTimeout() {
        return hardTimeout;
    }

    @Override
    public OFFlowModify.Builder setHardTimeout(int hardTimeout) {
        this.hardTimeout = hardTimeout;
        this.hardTimeoutSet = true;
        return this;
    }
    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public OFFlowModify.Builder setPriority(int priority) {
        this.priority = priority;
        this.prioritySet = true;
        return this;
    }
    @Override
    public OFBufferId getBufferId() {
        return bufferId;
    }

    @Override
    public OFFlowModify.Builder setBufferId(OFBufferId bufferId) {
        this.bufferId = bufferId;
        this.bufferIdSet = true;
        return this;
    }
    @Override
    public OFPort getOutPort() {
        return outPort;
    }

    @Override
    public OFFlowModify.Builder setOutPort(OFPort outPort) {
        this.outPort = outPort;
        this.outPortSet = true;
        return this;
    }
    @Override
    public long getOutGroup()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property outGroup not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setOutGroup(long outGroup) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property outGroup not supported in version 1.0");
    }
    @Override
    public Set<OFFlowModFlags> getFlags() {
        return flags;
    }

    @Override
    public OFFlowModify.Builder setFlags(Set<OFFlowModFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public Match getMatch() {
        return match;
    }

    @Override
    public OFFlowModify.Builder setMatch(Match match) {
        this.match = match;
        this.matchSet = true;
        return this;
    }
    @Override
    public List<OFInstruction> getInstructions()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }

    @Override
    public OFFlowModify.Builder setInstructions(List<OFInstruction> instructions) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property instructions not supported in version 1.0");
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFFlowModify.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
//
        @Override
        public OFFlowModify build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Match match = this.matchSet ? this.match : DEFAULT_MATCH;
            if(match == null)
                throw new NullPointerException("Property match must not be null");
            U64 cookie = this.cookieSet ? this.cookie : DEFAULT_COOKIE;
            if(cookie == null)
                throw new NullPointerException("Property cookie must not be null");
            int idleTimeout = this.idleTimeoutSet ? this.idleTimeout : DEFAULT_IDLE_TIMEOUT;
            int hardTimeout = this.hardTimeoutSet ? this.hardTimeout : DEFAULT_HARD_TIMEOUT;
            int priority = this.prioritySet ? this.priority : DEFAULT_PRIORITY;
            OFBufferId bufferId = this.bufferIdSet ? this.bufferId : DEFAULT_BUFFER_ID;
            if(bufferId == null)
                throw new NullPointerException("Property bufferId must not be null");
            OFPort outPort = this.outPortSet ? this.outPort : DEFAULT_OUT_PORT;
            if(outPort == null)
                throw new NullPointerException("Property outPort must not be null");
            Set<OFFlowModFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            List<OFAction> actions = this.actionsSet ? this.actions : DEFAULT_ACTIONS;
            if(actions == null)
                throw new NullPointerException("Property actions must not be null");


            return new OFFlowModifyVer10(
                    xid,
                    match,
                    cookie,
                    idleTimeout,
                    hardTimeout,
                    priority,
                    bufferId,
                    outPort,
                    flags,
                    actions
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFFlowModify> {
        @Override
        public OFFlowModify readFrom(ChannelBuffer bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 14
            byte type = bb.readByte();
            if(type != (byte) 0xe)
                throw new OFParseError("Wrong type: Expected=OFType.FLOW_MOD(14), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            Match match = ChannelUtilsVer10.readOFMatch(bb);
            U64 cookie = U64.ofRaw(bb.readLong());
            // fixed value property command == 1
            short command = bb.readShort();
            if(command != (short) 0x1)
                throw new OFParseError("Wrong command: Expected=OFFlowModCommand.MODIFY(1), got="+command);
            int idleTimeout = U16.f(bb.readShort());
            int hardTimeout = U16.f(bb.readShort());
            int priority = U16.f(bb.readShort());
            OFBufferId bufferId = OFBufferId.of(bb.readInt());
            OFPort outPort = OFPort.read2Bytes(bb);
            Set<OFFlowModFlags> flags = OFFlowModFlagsSerializerVer10.readFrom(bb);
            List<OFAction> actions = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFActionVer10.READER);

            OFFlowModifyVer10 flowModifyVer10 = new OFFlowModifyVer10(
                    xid,
                      match,
                      cookie,
                      idleTimeout,
                      hardTimeout,
                      priority,
                      bufferId,
                      outPort,
                      flags,
                      actions
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", flowModifyVer10);
            return flowModifyVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFFlowModifyVer10Funnel FUNNEL = new OFFlowModifyVer10Funnel();
    static class OFFlowModifyVer10Funnel implements Funnel<OFFlowModifyVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFFlowModifyVer10 message, PrimitiveSink sink) {
            // fixed value property version = 1
            sink.putByte((byte) 0x1);
            // fixed value property type = 14
            sink.putByte((byte) 0xe);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            message.match.putTo(sink);
            message.cookie.putTo(sink);
            // fixed value property command = 1
            sink.putShort((short) 0x1);
            sink.putInt(message.idleTimeout);
            sink.putInt(message.hardTimeout);
            sink.putInt(message.priority);
            message.bufferId.putTo(sink);
            message.outPort.putTo(sink);
            OFFlowModFlagsSerializerVer10.putTo(message.flags, sink);
            FunnelUtils.putList(message.actions, sink);
        }
    }


    public void writeTo(ChannelBuffer bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFFlowModifyVer10> {
        @Override
        public void write(ChannelBuffer bb, OFFlowModifyVer10 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 1
            bb.writeByte((byte) 0x1);
            // fixed value property type = 14
            bb.writeByte((byte) 0xe);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            message.match.writeTo(bb);
            bb.writeLong(message.cookie.getValue());
            // fixed value property command = 1
            bb.writeShort((short) 0x1);
            bb.writeShort(U16.t(message.idleTimeout));
            bb.writeShort(U16.t(message.hardTimeout));
            bb.writeShort(U16.t(message.priority));
            bb.writeInt(message.bufferId.getInt());
            message.outPort.write2Bytes(bb);
            OFFlowModFlagsSerializerVer10.writeTo(bb, message.flags);
            ChannelUtils.writeList(bb, message.actions);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFFlowModifyVer10(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("match=").append(match);
        b.append(", ");
        b.append("cookie=").append(cookie);
        b.append(", ");
        b.append("idleTimeout=").append(idleTimeout);
        b.append(", ");
        b.append("hardTimeout=").append(hardTimeout);
        b.append(", ");
        b.append("priority=").append(priority);
        b.append(", ");
        b.append("bufferId=").append(bufferId);
        b.append(", ");
        b.append("outPort=").append(outPort);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("actions=").append(actions);
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
        OFFlowModifyVer10 other = (OFFlowModifyVer10) obj;

        if( xid != other.xid)
            return false;
        if (match == null) {
            if (other.match != null)
                return false;
        } else if (!match.equals(other.match))
            return false;
        if (cookie == null) {
            if (other.cookie != null)
                return false;
        } else if (!cookie.equals(other.cookie))
            return false;
        if( idleTimeout != other.idleTimeout)
            return false;
        if( hardTimeout != other.hardTimeout)
            return false;
        if( priority != other.priority)
            return false;
        if (bufferId == null) {
            if (other.bufferId != null)
                return false;
        } else if (!bufferId.equals(other.bufferId))
            return false;
        if (outPort == null) {
            if (other.outPort != null)
                return false;
        } else if (!outPort.equals(other.outPort))
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (actions == null) {
            if (other.actions != null)
                return false;
        } else if (!actions.equals(other.actions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((match == null) ? 0 : match.hashCode());
        result = prime * result + ((cookie == null) ? 0 : cookie.hashCode());
        result = prime * result + idleTimeout;
        result = prime * result + hardTimeout;
        result = prime * result + priority;
        result = prime * result + ((bufferId == null) ? 0 : bufferId.hashCode());
        result = prime * result + ((outPort == null) ? 0 : outPort.hashCode());
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((actions == null) ? 0 : actions.hashCode());
        return result;
    }

}
